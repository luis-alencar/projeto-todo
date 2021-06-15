package com.crudaula.projetoaula;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.crudaula.projetoaula.entities.ToDo;
import com.crudaula.projetoaula.repository.ToDoRepository;

@SpringBootApplication
public class ProjetoaulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoaulaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ToDoRepository repository) {
		return args -> {
			ToDo toDo0 = new ToDo(null, "Atividades", "23/06/21", true);
			repository.save(toDo0);
			
			ToDo toDo1 = new ToDo(null, "Exercicios", "30/06/21", false);
			repository.save(toDo1);
			
			ToDo toDo2 = new ToDo(null, "Planejamento", "28/06/21", true);
			repository.save(toDo2);
			
			ToDo toDo3 = new ToDo(null, "Realização", "24/06/21", false);
			repository.save(toDo3);
			
			ToDo toDo4 = new ToDo(null, "Estrutura", "17/06/21", true);
			repository.save(toDo4);
			
		};
	}
}
