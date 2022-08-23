package com.heaven.src2e2.handlers;

import com.heaven.src2e2.model.Product;
import com.heaven.src2e2.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@RequiredArgsConstructor
public class ProductHandler {
    private final ProductService productService;
    public Mono<ServerResponse> getAll(ServerRequest request){
        return ok().contentType(MediaType.TEXT_EVENT_STREAM).body(productService.getAll(), Product.class);
    }
}
