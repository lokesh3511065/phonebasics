
package com.phone.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phone.demo.PhoneApplica;

@SpringBootApplication
public class PhoneApplica {

	public static void main(String[] args) {
		
		SpringApplication.run(PhoneApplica.class, args);
	
	
		PhoneBuild s=new PhoneBuild(1L,"Lokesh",99498L);
		
		System.out.println(s.toString());
	}

}