package com.pedro.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	//injetando o repository
	private TodoRepository repository;
	public TodoService (TodoRepository todoRepository) {
		this.repository = todoRepository;
	}
	
	
	public TodoEntity salvar(TodoEntity novoTodo) {
		return repository.save(novoTodo);
	}
	
	public void atualizarStatus(TodoEntity todo) {
		repository.save(todo);
	}
	
	public TodoEntity buscarPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
