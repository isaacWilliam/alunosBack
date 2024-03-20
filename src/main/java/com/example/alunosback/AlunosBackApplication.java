package com.example.alunosback;

import com.example.alunosback.enums.Category;
import com.example.alunosback.model.Curso;
import com.example.alunosback.repository.CursoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AlunosBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlunosBackApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CursoRepository cursoRepository) {
		return args -> {
			cursoRepository.deleteAll();

			Curso c = new Curso();
			c.setDsNome("Angular");
			c.setFgCategory(Category.FRONTEND);
			cursoRepository.save(c);
		};
	}
}
