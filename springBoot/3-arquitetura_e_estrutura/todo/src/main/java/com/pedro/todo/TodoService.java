package com.pedro.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	//injetando o repository
	private TodoRepository repository;
	private TodoValidator validator;
	private MailSender mailSender;
	public TodoService (TodoRepository todoRepository, TodoValidator todoValidator, MailSender todoMailSender) {
		this.repository = todoRepository;
		this.validator = todoValidator;
		this.mailSender = todoMailSender;
	}
	
	
	public TodoEntity salvar(TodoEntity novoTodo) {
		validator.validar(novoTodo);
		return repository.save(novoTodo);
	}
	
	public void atualizarStatus(TodoEntity todo) {
		repository.save(todo);
		mailSender.enviar("Todo de codigo " + todo.getDescricao());
	}
	
	public TodoEntity buscarPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
