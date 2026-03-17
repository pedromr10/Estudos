package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Order;

//poderia colocar o repository aqui, mas o jparepository ja faz o trabalho, pois a interface é herdada dele:
//@Repository

//nessa interface é onde serao feitas as operacoes com a classe user
//para instanciar um repository, tem de extender a jparepository, onde: <classe do repository, tipo da chave primaria>
public interface OrderRepository extends JpaRepository<Order, Long>{
	//nesse caso em especifico, nao precisaremos instanciar as operacoes na interface, pois o spring data jpa ja tem uma implementacao padrao para essa interface
}
