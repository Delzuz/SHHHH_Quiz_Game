package com.example.SHHHH_Quiz_Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShhhhController {

    @Autowired
    UserRepository repository;

    @GetMapping("/")
    public String start(){
        return "start";
    }

    @GetMapping("/signup")
    public String signupGet (Model model) {
        User user = new User(null,null);
        model.addAttribute("user" , user);
        System.out.println(repository.printList().size());

        return "create";
    }
    @PostMapping("/signup")
    public String signup (@ModelAttribute User user) {
        System.out.println(user.getUsername());
        repository.addUser(user);
        System.out.println(repository.printList().size());
        return "create";
    }


    @GetMapping("/userpage")
    public String userpage() { return "userpage"; }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "login";
    }
}
