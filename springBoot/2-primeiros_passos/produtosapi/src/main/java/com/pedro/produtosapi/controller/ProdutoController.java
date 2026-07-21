package com.pedro.produtosapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.produtosapi.model.Produto;

@RestController //recebe requisicoes web
@RequestMapping("/produtos")
public class ProdutoController {
	
	//salvar produto
	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		System.out.println("Produto recebido: " + produto);
		return produto;
	}
}
