package com.example.demo;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.PasswordService;

@SpringBootApplication
public class PassgenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassgenApplication.class, args);
		PasswordService service=new PasswordService();
	
		
	}

}
