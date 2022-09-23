package com.example.SHHHH_Quiz_Game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.List;
import java.util.Random;

@Controller
public class ShhhhController {
    Logger logger = LoggerFactory.getLogger(ShhhhController.class);
    @Autowired
    userRepositoryDatabase userRepository;

    @Autowired
    QuestionsRepositoryDatabase qRepository;


    @GetMapping("/")
    public String start(){
        return "start";
    }

    @GetMapping("/signup")
    public String signupGet (Model model) {
        User user = new User(null,null);
        model.addAttribute("user" , user);
        //System.out.println(repository.printList().size());

        return "create";
    }
    @PostMapping("/save")
    public String signup (@ModelAttribute User user) {
        //User newUser = new User(user.getUsername(),user.getPassword());
        userRepository.save(user);
        SecurityConfig.addUser(user.getUsername(),user.getPassword());
        //repository.addUser(user);

        //System.out.println(repository.printList().size());
        return "redirect:/";
    }


    @GetMapping("/userpage")
    public String userpage(HttpSession session) {
        session.getAttribute("user");
        return "userpage";
    }

    @GetMapping("/login")
    public String loginGet (){
        return "login";
    }

    @PostMapping("/login")
    public String login(HttpSession session, @RequestParam String username, @RequestParam String password) {
        logger.info(username);
        List<User> users = userRepository.findByUsername(username);
        if (users.size() > 0 && users.get(0).getPassword().equals(password)) {
            session.setAttribute("user", users.get(0));

            return "redirect:/userpage";
        }
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout() {
        return "login";
    }


    //Detta måste bytas till session

    @GetMapping("/game")
    public String startGame (Model model, HttpSession session) {
        //QuestionRepository queRepository = new QuestionRepository();
        Random random = new Random();
        Long nextQuestion = random.nextLong(1,4);
        int ranInt = random.nextInt(0,5);
        Question question = qRepository.findById(nextQuestion).get();
        session.setAttribute("question", question);
        ranInt = random.nextInt(0,5);
        session.setAttribute("ranInt",ranInt);
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

        return switch ((int)session.getAttribute("ranInt")) {
            case 1 -> "game1";
            case 2 -> "game2";
            case 3 -> "game3";
            default -> "game";
        };
    }

}
