package gr.hua.dit.ds.ds2024Team77.controllers;

import gr.hua.dit.ds.ds2024Team77.entities.role;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import gr.hua.dit.ds.ds2024Team77.repository.roleRepository;

@Controller
public class authController {

    roleRepository roleRepository;

    public authController(roleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    public void setup() {
        role role_user = new role("BASIC_USER");
        role roleFreelancer = new role("FREELANCER");
        role role_admin = new role("ROLE_ADMIN");

        roleRepository.updateOrInsert(role_user);
        roleRepository.updateOrInsert(roleFreelancer);
        roleRepository.updateOrInsert(role_admin);
    }

    @GetMapping("/login")
    public String login(){
        return "auth/login";
    }
}
