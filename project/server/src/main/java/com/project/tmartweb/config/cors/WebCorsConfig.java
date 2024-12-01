package com.project.tmartweb.config.cors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebCorsConfig {
    @Bean
    public WebMvcConfigurer corsController() {
        String frontendUrl = System.getProperty("link.frontend");
        return new WebMvcConfigurer() {
            @SuppressWarnings("null")
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins(frontendUrl, "https://tmart-web.vercel.app")
                        .allowedMethods("PUT", "DELETE", "GET", "POST")
                        .exposedHeaders("Content-Disposition");
            }
        };
    }
}