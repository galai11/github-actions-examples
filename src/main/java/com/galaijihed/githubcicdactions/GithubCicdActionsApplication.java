package com.galaijihed.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {
	public String message(){
		return "Welcome to CICD imlementation"
	}
/*
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/galai11/github-actions-examples.git
git push -u origin main
 */
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
