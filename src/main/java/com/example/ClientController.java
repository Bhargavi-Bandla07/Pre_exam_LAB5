package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ClientController 
{
	@GetMapping("/")
   public String home()
   {
	return "CI/CD and Cloud Devops EXAM PRACTICE ";
	
   }
	
	
	 @GetMapping("/demo")
	   public String demo()
	   {
		   return "Jenkins BACKEND PRACTICE ";
	   }
	   
   @GetMapping("/test")
   public String test()
   {
	   return "Deploy springboot APLLICATION  using Jenkins";
   }
   
}