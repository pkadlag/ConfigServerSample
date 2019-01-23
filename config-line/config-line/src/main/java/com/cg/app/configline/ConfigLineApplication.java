package com.cg.app.configline;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigLineApplication.class, args);
	}

	@RefreshScope
	@RestController
	public class ConfigClientController
	{
		@Value("${message: default}")
	    private String message;
		
		
		
		@RequestMapping("/message")
		public String getName() {
			return this.message;
		}
	}
	
	
}

