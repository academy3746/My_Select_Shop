package com.sparta.week04.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // This Class carry on POST / GET / DELETE for total Application
}
