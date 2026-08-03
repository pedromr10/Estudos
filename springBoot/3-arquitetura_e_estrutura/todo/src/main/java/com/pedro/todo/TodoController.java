package com.pedro.todo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todos")
public class TodoController {
	
	private TodoService service;
	public TodoController(TodoService todoService) {
		this.service = todoService;
	}
	
	@PostMapping
	public void salvar(@RequestBody TodoEntity todo) {
		this.service.salvar(todo);
	}
}
