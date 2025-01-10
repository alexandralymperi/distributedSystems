package gr.hua.dit.ds.ds2024Team77.service;

import gr.hua.dit.ds.ds2024Team77.entities.role;
import gr.hua.dit.ds.ds2024Team77.repository.roleRepository;
import gr.hua.dit.ds.ds2024Team77.repository.userRepository;
import jakarta.transaction.Transactional;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import gr.hua.dit.ds.ds2024Team77.entities.user;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

//TODO updateUserRole
@Service
public class userService implements UserDetailsService {

    private userRepository userRepository;
    private roleRepository roleRepository;
    private BCryptPasswordEncoder passwordEncoder;

    public userService(userRepository userRepository, roleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public Integer saveUser(user user){

        String pswd = user.getPassword();
        String encodedPswd = passwordEncoder.encode(pswd);
        user.setPassword(encodedPswd);

        role role = roleRepository.findByName("BASIC_USER")
                .orElseThrow(() -> new RuntimeException("Error: Role not found."));
        Set<role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRoles(userRoles);

        user = userRepository.save(user);
        return user.getId();
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{

        Optional<user> opt = userRepository.findByUsername(username);

        if(opt.isEmpty()){
            throw new UsernameNotFoundException("User with email: " +username+" was not found.");
        }else{
            user user = opt.get();
            return new org.springframework.security.core.userdetails.User(
                    user.getEmail(),
                    user.getPassword(),
                    user.getRoles()
                            .stream()
                            .map(role-> new SimpleGrantedAuthority(role.toString()))
                            .collect(Collectors.toSet())
            );
        }

    }

    @Transactional
    public Object getUsers(){ return userRepository.findAll(); }

}

