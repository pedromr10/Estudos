package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;

@RestController //"Essa classe é um controlador REST que responde requisições HTTP." Ou seja, ela recebe requisições da internet (browser, Postman, frontend etc.).
@RequestMapping(value = "/orders") //define a URL base do controller. Significa que todas as rotas dessa classe começam com: http://localhost:8080/users
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping //define um endpoint(um endereço de uma API que pode ser acessado para executar alguma ação) HTTP do tipo GET.
	public ResponseEntity<List<Order>> findAll(){
		//1L pq é long
		//exemplo mockado:
		//User u = new User(1L, "pedro", "pedro@gmail.com", "2828282", "123senha");
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}") //indica que a requisicao vai receber um id na url, uma variavel (/users/1, por exemplo)
	//o pathvariable pega o valor de id
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
