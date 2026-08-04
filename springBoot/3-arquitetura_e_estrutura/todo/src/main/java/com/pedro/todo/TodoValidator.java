package com.pedro.todo;

import org.springframework.stereotype.Component;

@Component //component "eh a annotation pai de todos", de service, controller..
//obs: o component tem como escopo singleton, ou seja, por padrao, quando o Spring cria um bean, ele cria apenas uma instancia e reutiliza essa mesma instancia sempre que alguem precisar dela. para gerenciar o escopo, tem a annotation @Scope("tipoEscopo")
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
