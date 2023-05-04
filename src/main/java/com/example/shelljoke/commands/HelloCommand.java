package com.example.shelljoke.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

//indicates that this class contains shell methods just like @Configuration contains @Bean
@ShellComponent
public class HelloCommand {

    @ShellMethod(key = "hello", value = "I will say hello")
    public String hello(@ShellOption(defaultValue = "World") String arg) {
        return "Hello," + arg + "!";
    }

    @ShellMethod(key = "goodbye", value = "I will say goodbye")
    public String goodbye() {
        return "Goodbye!";
    }
}
