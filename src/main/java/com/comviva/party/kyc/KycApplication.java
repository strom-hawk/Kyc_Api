package com.comviva.party.kyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@ComponentScan({"com.comviva.party.controller","com.comviva.party.service"})
public class KycApplication {


	public static void main(String[] args) {
		SpringApplication.run(KycApplication.class, args);
	}

}
