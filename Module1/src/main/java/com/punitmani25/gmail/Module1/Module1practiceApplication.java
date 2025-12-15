package com.punitmani25.gmail.Module1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1practiceApplication implements CommandLineRunner {
	@Autowired
	Payment p1;
	@Autowired
	Payment p2;
	public static void main(String[] args) {

		SpringApplication.run(Module1practiceApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		p1.pay();
		p2.pay();
	}
}
