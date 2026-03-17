package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

//Para o Spring conseguir fazer injeção de dependência, o objeto precisa existir dentro do container do Spring. Só entram no container classes que são registradas como componentes (beans), nesse caso, o @Service.
@Service
//camada de servico
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	//so repassa a chamada da funcao:
	public List<User> findAll(){
		return repository.findAll(); //esse findall vem da interface jpareposiroty, que ja tem varios metodos prontos
	}
	
	public User findById(Long id) {
		//aqui é optional pois o usuario pode nao existir
		Optional<User> obj = repository.findById(id);
		return obj.get(); //pega o valor que esta dentro do optional
	}
}
