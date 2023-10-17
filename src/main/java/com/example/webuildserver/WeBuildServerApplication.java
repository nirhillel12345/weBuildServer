package com.example.webuildserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeBuildServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeBuildServerApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigis("*").allowedMethods("*").allowedHeaders("*");
            }
        };
    }

}
