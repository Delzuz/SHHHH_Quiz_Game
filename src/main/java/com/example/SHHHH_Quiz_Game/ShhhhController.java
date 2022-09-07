package com.example.SHHHH_Quiz_Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShhhhController {

    @GetMapping("/")
    public String start(){
        return "start";
    }

    @GetMapping("/signup")
    public String signup () {
        return "create";
    }

    @GetMapping("/userpage")
    public String userpage() { return "userpage"; }
}
