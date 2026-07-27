package com.pedro.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
@Table(name = "produto")
public class Produto {
	@Id
	@Column
	private String id;
	@Column
	private String nome;
	@Column
	private String descricao;
	@Column
	private Double preco;
	//obs: caso no banco de dados o nome da propriedade esteja diferente, pode 
	// referencia-la assim: @Column(name = "nomeNoBanco"), o mesmo para a anotation @Table
}
