package com.devsuperior.devsuperiorproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.devsuperiorproject.entities.Category;
import com.devsuperior.devsuperiorproject.entities.Product;
import com.devsuperior.devsuperiorproject.repositories.CategoryRepository;
import com.devsuperior.devsuperiorproject.repositories.ProductRepository;

@SpringBootApplication
public class DevsuperiorprojectApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DevsuperiorprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category categoryId1 = new Category(null, "Electronics");
		Category categoryId2 = new Category(null, "Books");
		
		Product p1 = new Product(null, "TV", 2200.00, categoryId1);
		Product p2 = new Product(null, "Domain Driven Design", 120.00, categoryId2);
		Product p3 = new Product(null, "PS5", 2800.00, categoryId1);
		Product p4 = new Product(null, "Docker", 100.00, categoryId2);
		
		categoryId1.getProducts().addAll(Arrays.asList(p1, p3));
		categoryId2.getProducts().addAll(Arrays.asList(p2, p4));

		categoryRepository.save(categoryId1);
		categoryRepository.save(categoryId2);

		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
	}

}
