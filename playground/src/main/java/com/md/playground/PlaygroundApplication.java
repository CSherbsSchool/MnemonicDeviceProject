package com.md.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PlaygroundApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PlaygroundApplication.class);
    }

    private static Class<PlaygroundApplication> PlaygroundApplicationClass = PlaygroundApplication.class;
}
