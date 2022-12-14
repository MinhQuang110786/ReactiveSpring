package com.heaven.src2e2.config;

import com.heaven.src2e2.handlers.ProductHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RoutesConfig {
    @Bean
    public RouterFunction<ServerResponse> router(ProductHandler handler){
        return route().GET("/all",handler::getAll)
                .build();
    }
}
