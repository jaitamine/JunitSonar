package com.inti.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inti.formation.entity.User;
import com.inti.formation.service.IUserService;
import com.inti.formation.service.UserService;

@SpringBootApplication
public class JunitProjectApp implements CommandLineRunner{

	@Autowired
	IUserService uService = new UserService();
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(JunitProjectApp.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	
		User us1  = new User(1,"amine");
		User us2  = new User(2,"karim");
		User us3  = new User(3,"khalid");
		
		uService.add(us1);
		uService.add(us2);
		uService.add(us3);
		
	}

	
}
