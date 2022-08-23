package com.heaven.src2e2.services;

import com.heaven.src2e2.model.Product;
import com.heaven.src2e2.proxy.ProductProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductProxy proxy;
    public Flux<Product> getAll(){
        return proxy.getAll();
    }
}
