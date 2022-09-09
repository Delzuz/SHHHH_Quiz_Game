package com.example.SHHHH_Quiz_Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;
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

    Random random = new Random();
    int ranInt = random.nextInt(0,5);
    @GetMapping("/game")
    public String startGame (Model model, HttpSession session) {
        QuestionRepository queRepository = new QuestionRepository();
        Question question = queRepository.getRandomQuestion();
        session.setAttribute("question", question);
        ranInt = random.nextInt(0,5);
        //model.addAttribute("randomInt",ranInt);
        return switch (ranInt) {
            case 1 -> "game1";
            case 2 -> "game2";
            case 3 -> "game3";
            default -> "game";
        };



    }

    @PostMapping("/game")
    public String startGamePost (Model model, @RequestParam String action, HttpSession session) {
        session.getAttribute("question");
        System.out.println(action);
        if (action.equals("session.question.answerW1") || action.equals("session.question.answerW2") || action.equals("session.question.answerW3")) {
            model.addAttribute("incorrectAnswer", true);
        }


        if (action.equals("session.question.answerC")){
            model.addAttribute("correctAnswer", true);
        }

        return switch (ranInt) {
            case 1 -> "game1";
            case 2 -> "game2";
            case 3 -> "game3";
            default -> "game";
        };
    }

}
