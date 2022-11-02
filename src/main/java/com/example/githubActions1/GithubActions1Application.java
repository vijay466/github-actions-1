package com.example.githubActions1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActions1Application {
@GetMapping("/welcome")
public String welcome() {
	return "hello";
}
	public static void main(String[] args) {
		SpringApplication.run(GithubActions1Application.class, args);
	}

}
