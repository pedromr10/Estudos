package com.pedro.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TodoApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(TodoApplication.class);
		
		builder.lazyInitialization(true); //quando colocado como true, todos os beans terao a annotation @Lazy por padrao. tomar cuidado com essa funcionalidade, pois pode omitir erros que serao acionados em runtime 
	}

}
