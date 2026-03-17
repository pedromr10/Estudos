package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity //Indica que essa classe Java representa uma tabela no banco de dados
@Table(name = "tb_user") //tivemos q dar outro nome pois a palavra User é uma palavra reservada do banco de dados h2
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id //indica q o id é a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Diz que o valor do id será gerado automaticamente pelo banco de dados. Não precisa preencher esse campo manualmente ao criar um usuário.
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	@JsonIgnore //ignorar um atributo na hora de converter um objeto Java para JSON. Pois temos um relacionamento bidirecional entre order e user, geraria um loop infinito, assim, o jsonignore quebra o ciclo
	@OneToMany(mappedBy = "client") //um usuario tem varios pedidos (um para muitos). veio do "private User client;"
	private List<Order> orders = new ArrayList<>(); //obs: em colecao so adicionamos o get, set nao
	
	//em framework é boa prática/obrigacao ter construtor vazio
	public User() {}

	public User(Long id, String name, String email, String phone, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Order> getOrders() {
		return orders;
	}

	//para comparar objeto com outro:
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
