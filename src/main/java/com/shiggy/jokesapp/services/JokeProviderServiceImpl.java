package com.shiggy.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeProviderServiceImpl implements JokeProviderService{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuotes getChuckNorrisQuotes() {
        return chuckNorrisQuotes;
    }

    public void setChuckNorrisQuotes(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public JokeProviderServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
