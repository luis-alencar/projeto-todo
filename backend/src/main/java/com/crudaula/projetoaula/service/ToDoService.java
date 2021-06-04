package com.crudaula.projetoaula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudaula.projetoaula.entities.ToDo;
import com.crudaula.projetoaula.repository.ToDoRepository;

@Service
public class ToDoService {
	
	@Autowired
	private ToDoRepository repository;
	
	public List<ToDo> listar(){
		return repository.findAll();
	}
	
	public ToDo incluir(ToDo toDo) {
		ToDo toDoRetorno = repository.save(toDo);
		return toDoRetorno;
	}
}
