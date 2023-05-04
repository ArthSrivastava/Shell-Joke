package com.example.shelljoke.client;

import com.example.shelljoke.model.JokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface JokeClient {
    @GetExchange("/")
    JokeResponse client();
}
