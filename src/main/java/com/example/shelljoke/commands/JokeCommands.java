package com.example.shelljoke.commands;

import com.example.shelljoke.client.JokeClient;
import com.example.shelljoke.model.JokeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@RequiredArgsConstructor
public class JokeCommands {

    private final JokeClient jokeClient;

    @ShellMethod(key = "joke", value = "I will return a random joke!")
    public String getRandomJoke() {
        JokeResponse response = jokeClient.client();
        return response.joke();
    }
}
