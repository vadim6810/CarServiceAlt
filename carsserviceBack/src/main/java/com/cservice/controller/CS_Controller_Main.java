package com.cservice.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@CrossOrigin
@RestController
@ComponentScan
@EnableAutoConfiguration
@RequestMapping(value = "api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CS_Controller_Main {

	public static void main(String[] args) {
		SpringApplication.run(CS_Controller_Main.class, args);
	}


	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/ping",method = RequestMethod.GET)//us test
	public String ping(){
		return "pong";
	}


	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "login",method = RequestMethod.POST)//us test
	public void login(HttpServletRequest request, HttpServletResponse response){


		response.addCookie(new Cookie("id","121212"));

	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "logout",method = RequestMethod.POST)//us test
	public void logout(HttpServletRequest request, HttpServletResponse response){



	}

}
