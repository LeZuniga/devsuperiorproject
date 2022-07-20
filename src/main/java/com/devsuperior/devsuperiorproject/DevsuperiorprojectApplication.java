package com.devsuperior.devsuperiorproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.devsuperiorproject.entities.Category;
import com.devsuperior.devsuperiorproject.repositories.CategoryRepository;

@SpringBootApplication
public class DevsuperiorprojectApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(DevsuperiorprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category categoryId1 = new Category(1L, "Eletronics");
		Category categoryId2 = new Category(2L, "Books");	

		categoryRepository.save(categoryId1);
		categoryRepository.save(categoryId2);
	}

}
