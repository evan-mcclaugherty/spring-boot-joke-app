package com.evnmck.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ChuckNorrisService implements JokeService {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
