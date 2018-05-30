package com.evnmck.jokeapp.controllers;

import com.evnmck.jokeapp.services.JokeService;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ChuckNorrisController {
    private JokeService jokeService;

    public ChuckNorrisController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJokes(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "joke";
    }
}
