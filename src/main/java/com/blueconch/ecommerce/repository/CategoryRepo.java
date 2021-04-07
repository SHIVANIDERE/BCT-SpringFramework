package com.blueconch.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blueconch.ecommerce.model.Category;

public interface CategoryRepo  extends JpaRepository<Category, Long> {

}