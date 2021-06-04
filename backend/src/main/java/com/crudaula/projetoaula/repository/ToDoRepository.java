package com.crudaula.projetoaula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudaula.projetoaula.entities.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
