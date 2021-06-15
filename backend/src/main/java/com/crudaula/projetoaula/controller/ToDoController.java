package com.crudaula.projetoaula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(path = "concluidas/{checked}")
	public List<ToDo> getTaskbyChecked(@PathVariable("checked") Boolean Checked){
		return toDoService.getTaskbyChecked(Checked);
	}
	
	@DeleteMapping( path = "remove/{id}")
	public Long remover(@PathVariable("id") Long id) {
		return toDoService.remover(id);
	}
	
	@PutMapping()
	public ToDo alterarUsingJson(@RequestBody ToDo toDo) {
		return toDoService.alterarEstado(toDo);
	}
}
