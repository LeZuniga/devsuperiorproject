package com.devsuperior.devsuperiorproject.repositories;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devsuperiorproject.entities.Product;

@Entity
public interface ProductRepository extends JpaRepository<Product, Long>{

}