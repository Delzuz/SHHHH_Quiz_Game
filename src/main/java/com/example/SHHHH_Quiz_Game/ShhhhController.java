package com.example.SHHHH_Quiz_Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;

@Controller
public class ShhhhController {

    @Autowired
    UserRepository repository;
    QuestionRepository qRepository;

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

    @GetMapping("/game")
    public String startGame (Model model) {
        QuestionRepository queRepository = new QuestionRepository();
        Question question = queRepository.getRandomQuestion();
        model.addAttribute("question", question);
        Random random = new Random();
        return switch (random.nextInt(1, 4)) {
            case 1 -> "game1";
            case 2 -> "game2";
            case 3 -> "game3";
            default -> "game";
        };

    }

}
