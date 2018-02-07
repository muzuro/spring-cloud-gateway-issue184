package ru.muzuro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.Routes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class Application {

    @Bean
    public RouteLocator routes() {
        return Routes.locator()
                .route("userapi")
                .uri("http://httpbin.org:80")
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
