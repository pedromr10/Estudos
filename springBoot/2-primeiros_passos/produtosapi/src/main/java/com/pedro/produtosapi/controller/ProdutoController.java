package com.pedro.produtosapi.controller;

import com.pedro.produtosapi.repository.ProdutoRepository;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.produtosapi.model.Produto;

@RestController //recebe requisicoes web
@RequestMapping("/produtos")
public class ProdutoController {
	
	private ProdutoRepository produtoRepository;
	public ProdutoController(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	//salvar produto
	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		System.out.println("Produto recebido: " + produto);
		var id = UUID.randomUUID().toString(); //esse uuid serve para a geracao de codigos unicos
		produto.setId(id);
		produtoRepository.save(produto);
		return produto;
	}
}
