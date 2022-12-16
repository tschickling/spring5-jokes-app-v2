package com.shiggy.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.shiggy.jokesapp.services.JokeProviderService;

@Controller
public class JokeController {
    private final JokeProviderService jokeProviderService;

    public JokeController(JokeProviderService jokeProviderService) {
        this.jokeProviderService = jokeProviderService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){

        model.addAttribute("joke", jokeProviderService.getJoke());

        return "joke/index";
    }
}
