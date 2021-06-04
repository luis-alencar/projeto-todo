package com.crudaula.projetoaula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudaula.projetoaula.entities.ToDo;
import com.crudaula.projetoaula.service.ToDoService;

@RestController
@RequestMapping(path = "api/v1/todo")
public class ToDoController {
	
	@Autowired
	private ToDoService toDoService;
	
	@GetMapping()
	public List<ToDo> ListarTodos(){
		return toDoService.listar();
	}
		
	@PostMapping()
	public ToDo incluir(@RequestBody ToDo toDo) {
		return toDoService.incluir(toDo);
	}
	
}
