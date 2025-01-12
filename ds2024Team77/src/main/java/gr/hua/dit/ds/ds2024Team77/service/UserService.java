package gr.hua.dit.ds.ds2024Team77.service;

import gr.hua.dit.ds.ds2024Team77.entities.Role;
import gr.hua.dit.ds.ds2024Team77.entities.User;
import gr.hua.dit.ds.ds2024Team77.repository.RoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import gr.hua.dit.ds.ds2024Team77.repository.UserRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder;
    private RoleRepository roleRepository;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
    }

    @Transactional
    public User getUser(Integer user_id){
        return userRepository.findById(user_id).get();
    }

    @Transactional
    public List<User> getUsers(){ return userRepository.findAll(); }

    @Transactional
    public Integer saveUser(User user){

        String pswd = user.getPassword();
        String encodedPswd = passwordEncoder.encode(pswd);
        user.setPassword(encodedPswd);

        Role role = roleRepository.findByName("BASIC_USER")
                .orElseThrow(() -> new RuntimeException("Error: Role not found."));
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRoles(userRoles);

        user = userRepository.save(user);
        return user.getId();
    }

    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> opt = userRepository.findByUsername(username);

        if(opt.isEmpty()){
            throw new UsernameNotFoundException("User with email: " +username+" was not found.");
        }else{
            User user = opt.get();
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
    public Integer updateUser(User user){
        user = userRepository.save(user);
        return user.getId();
    }

}
