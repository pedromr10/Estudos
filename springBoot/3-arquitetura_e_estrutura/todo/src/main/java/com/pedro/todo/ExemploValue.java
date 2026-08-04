package com.pedro.todo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {

	//obs: note que esse caminho pode ser encontrado no application.yml
	@Value("${app.config.variavel}")
	private String variavel;
	
	public void imprimirVariavel() {
		System.out.println(variavel);
	}
}
