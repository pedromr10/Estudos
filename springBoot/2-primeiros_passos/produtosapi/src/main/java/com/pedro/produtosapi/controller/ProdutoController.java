package com.pedro.produtosapi.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.produtosapi.model.Produto;
import com.pedro.produtosapi.repository.ProdutoRepository;

import jakarta.websocket.server.PathParam;

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
	
	//pegar produto:
	@GetMapping("/{id}")
	public Produto obterProdutoPorId(@PathVariable("id") String id) {
		//metodo1
		//Optional<Produto> produto = produtoRepository.findById(id);
		//return produto.isPresent() ? produto.get() : null;
		//na operacao ternaria acima: caso o optional ache algum valor, retorna o produto.get, caso nao ache, retorna null
		
		//metodo2:
		return produtoRepository.findById(id).orElse(null);
	}
	
	//remove produto:
	@DeleteMapping("/{id}")
	public void deletarProduto(@PathVariable("id") String id) {
		produtoRepository.deleteById(id);
	}
	
	//atualiza produto:
	@PutMapping("/{id}")
	public void atualizarProduto(@PathVariable("id") String id, @RequestBody Produto produto) {
		produto.setId(id);
		produtoRepository.save(produto);
	}
	
	//buscando por parametro:
	@GetMapping
	public List<Produto> buscaPorParametro(@PathParam("nome") String nome){
		return produtoRepository.findByNome(nome);
		//exemplo de busca pelo postman: http://localhost:8080/produtos?nome=Pendrive
	}
	
}






