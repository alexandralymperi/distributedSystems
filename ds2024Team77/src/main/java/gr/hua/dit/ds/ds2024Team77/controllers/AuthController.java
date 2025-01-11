package gr.hua.dit.ds.ds2024Team77.controllers;

import gr.hua.dit.ds.ds2024Team77.entities.Role;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import gr.hua.dit.ds.ds2024Team77.repository.RoleRepository;

@Controller
public class AuthController {

    RoleRepository roleRepository;

    public AuthController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    public void setup() {
        Role role_user = new Role("BASIC_USER");
        Role roleFreelancer = new Role("FREELANCER");
        Role role_admin = new Role("ADMIN");

        roleRepository.updateOrInsert(role_user);
        roleRepository.updateOrInsert(roleFreelancer);
        roleRepository.updateOrInsert(role_admin);
    }

    @GetMapping("/login")
    public String login(){
        return "auth/login";
    }
}
