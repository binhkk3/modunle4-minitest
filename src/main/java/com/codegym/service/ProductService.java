package com.codegym.service;

import com.codegym.model.Product;

import java.util.Optional;

public class ProductService implements IProductService {
    @Override
    public Iterable<Product> findAll() {
        return null;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void remove(Long id) {

    }
}
