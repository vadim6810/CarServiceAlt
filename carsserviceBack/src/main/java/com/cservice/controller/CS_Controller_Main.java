package com.cservice.controller;

import com.cservice.Entity.Commons.Account;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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
	@RequestMapping(value = "users/login",method = RequestMethod.POST)//us test
	public void login(@RequestParam String login,@RequestParam String password, HttpServletRequest request, HttpServletResponse response){

        Account acc;

        System.out.println(login);
        System.out.println(password);
		//
		Cookie cookie=new Cookie("X-API","");
        //".inetex.co.il"
//        cookie.setDomain("localhost");
//        cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
	}

}
