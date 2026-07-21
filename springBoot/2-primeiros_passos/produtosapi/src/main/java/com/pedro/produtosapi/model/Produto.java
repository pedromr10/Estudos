package com.pedro.produtosapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Produto {
	private String id;
	private String nome;
	private String descricao;
	private Double preco;
}
