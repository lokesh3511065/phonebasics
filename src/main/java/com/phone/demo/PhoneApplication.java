package com.phone.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


 

import com.phone.demo.PhoneApplication;



public class PhoneApplication {

	public static void main(String[] args) {
	

	
		SpringApplication.run(PhoneApplication.class, args);
		
          PhoneBuild s=new PhoneBuild(1L,"Lokes",99498L);
		
		System.out.println(s.toString());
	
	}
	
	
	
	

}
