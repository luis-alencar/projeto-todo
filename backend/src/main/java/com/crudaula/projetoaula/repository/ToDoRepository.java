package com.crudaula.projetoaula.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudaula.projetoaula.entities.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
	List<ToDo> findByChecked(Boolean checked);

}
