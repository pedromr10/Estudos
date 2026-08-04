package com.pedro.todo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Configuration
@ConfigurationProperties(prefix = "app.config")
public class AppProperties {
	
	private String variavel;
	private Integer valor1;
}
