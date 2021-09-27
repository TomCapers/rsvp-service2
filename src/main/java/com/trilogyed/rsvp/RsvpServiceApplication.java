package com.trilogyed.rsvp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
@EnableCaching
public class RsvpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsvpServiceApplication.class, args);
	}

	//adding a comment to test pipeline

}
