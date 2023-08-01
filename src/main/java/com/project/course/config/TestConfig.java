package com.project.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.course.entities.User;
import com.project.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{ //Classe de configuração

	@Autowired
	private UserRepository userRepository;
	
	
	public void run(String... args) throws Exception{//Será executada quando a aplicação iniciar
		
		User u1 = new User(null, "Maria Brown", "mariaB@gmail.com", "98888888", "1234");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "11112222", "1234");
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		
	}
	
	
	
	
}
