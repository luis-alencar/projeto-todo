package com.crudaula.projetoaula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
	
	public List<ToDo> getTaskbyChecked(Boolean checked){
		List<ToDo> toDo = repository.findByChecked(checked);
		if(CollectionUtils.isEmpty(toDo)) {
			throw new IllegalAccessError("Nenhum resultado para mostrar");
		}
		return toDo;
	}
	
	public Long remover(Long toDo) {
		repository.deleteById(toDo);
		return toDo;
	}

		public ToDo alterarEstado(ToDo toDo) {
		return repository.save(toDo);
	}
	
	
}
