package com.pedro.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("{id}")
	public void atualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo) {
		todo.setId(id);
		service.atualizarStatus(todo);
	}
	
	@GetMapping("{id")
	public TodoEntity buscarPorId(@PathVariable("id") Integer id) {
		return service.buscarPorId(id);
	}
}
