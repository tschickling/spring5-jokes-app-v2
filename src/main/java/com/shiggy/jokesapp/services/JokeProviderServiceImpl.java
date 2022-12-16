package com.shiggy.jokesapp.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeProviderServiceImpl implements JokeProviderService{

    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public ChuckNorrisQuotes getChuckNorrisQuotes() {
        return chuckNorrisQuotes;
    }

    public JokeProviderServiceImpl() {
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
