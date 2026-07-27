package com.pedro.produtosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.produtosapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String>{

}
