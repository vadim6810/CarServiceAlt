package com.cservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@CrossOrigin
@RestController
@ComponentScan
@EnableAutoConfiguration
@RequestMapping(value = "api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CarsserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsserviceApplication.class, args);
	}


	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/ping",method = RequestMethod.GET)
	public void ping(){

	}




}
