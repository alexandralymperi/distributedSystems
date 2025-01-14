package gr.hua.dit.ds.ds2024Team77.controllers;

import gr.hua.dit.ds.ds2024Team77.entities.User;
import gr.hua.dit.ds.ds2024Team77.repository.UserRepository;
import gr.hua.dit.ds.ds2024Team77.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    List<User> users_list = new ArrayList<User>();
    //List<userProfile> users_profile_list = new ArrayList<userProfile>();
    private UserService uService;

    private UserRepository uRepository;

    public UserController(UserService uService, UserRepository uRepository) {
        this.uService = uService;
        this.uRepository = uRepository;
    }

    @GetMapping("/register")
    public String register(Model model) {
        User new_user = new User();
        model.addAttribute("users", new_user);
        return "user_show";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute User new_user, Model model){
        //System.out.println("Roles: "+users.getRoles());
        //Integer id = uService.saveUser(new_user);
        //String message = "User '"+id+"' saved successfully !";
        //model.addAttribute("msg", message);
        return "index";
    }

    @GetMapping("/new")
    public String Show_Users(Model model){
        model.addAttribute("users_list", users_list);
        return "users_show";
    }

    @PostMapping("/new")
    public String Save_user(@ModelAttribute("user") User new_user, Model model){
        System.out.println(new_user);
        users_list.add(new_user);
        model.addAttribute("users", new_user);
        return "users_show";
    }



    //    @GetMapping("/{id}")
//    public String Show_UserProfile(@PathVariable Integer id, Model model){
//        users user_by_id = getUser(users_list,id);
//        model.addAttribute("projects", user_by_id);
//        return "user_show";
//    }

}
