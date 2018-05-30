package com.evnmck.jokeapp.models;

import javax.persistence.Entity;

@Entity
public class Joke {
    private String joke;

    public Joke(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return this.joke;
    }
}
