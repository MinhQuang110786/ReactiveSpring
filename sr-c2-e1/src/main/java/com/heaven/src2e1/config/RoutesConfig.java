package com.heaven.src2e1.config;

import com.heaven.src2e1.handler.ProductHandler;
import com.heaven.src2e1.model.Product;
import com.heaven.src2e1.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class RoutesConfig {

//    private final ProductService productService;
//
//    public RoutesConfig(ProductService productService) {
//        this.productService = productService;
//    }

    @Bean
    public RouterFunction<ServerResponse> router(ProductHandler handler){
        return route().GET("/products", handler::getAll)
                .build();
    }
}
