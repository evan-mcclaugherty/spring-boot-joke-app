package com.evnmck.jokeapp.controllers;

import com.evnmck.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisController {
    private JokeService jokeService;

    @Autowired
    public ChuckNorrisController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "joke";
    }
}
