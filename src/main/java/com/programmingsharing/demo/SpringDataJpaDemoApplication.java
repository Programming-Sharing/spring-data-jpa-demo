package com.programmingsharing.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.programmingsharing.demo.repositories.UserRepository;

@SpringBootApplication
public class SpringDataJpaDemoApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.getUserWithCustomQuery().forEach(System.out::println);		
	}

}
