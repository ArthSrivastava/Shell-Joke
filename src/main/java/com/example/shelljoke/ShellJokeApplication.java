package com.example.shelljoke;

import com.example.shelljoke.client.JokeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class ShellJokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShellJokeApplication.class, args);
	}

	@Bean
	JokeClient jokeClient() {
		WebClient webClient = WebClient
				.builder()
				.baseUrl("https://icanhazdadjoke.com")
				.defaultHeader("Accept", "application/json")
				.build();
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(
				WebClientAdapter.forClient(webClient)
		).build();
		return factory.createClient(JokeClient.class);
	}
}
