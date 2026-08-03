package com.pedro.todo;

import org.springframework.stereotype.Component;

@Component //component "eh a annotation pai de todos", de service, controller..
public class TodoValidator {
	
	private TodoRepository repository;
	public TodoValidator(TodoRepository todoRepository) {
		this.repository = todoRepository;
	}
	
	public void validar(TodoEntity todo) {
		if(existeTodoComEssaDescricao(todo.getDescricao())) {
			throw new IllegalArgumentException("Ja existe um todo com essa descricao");
		}
	}
	
	public boolean existeTodoComEssaDescricao(String descricao) {
		return repository.existsByDescricao(descricao);
	}
}
