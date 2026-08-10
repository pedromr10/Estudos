package com.pedro.libraryapi.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfiguration {

	@Value("${spring.datasource.url}")
	String url;
	@Value("${spring.datasource.username}")
	String username;
	@Value("${spring.datasource.password}")
	String password;
	@Value("${spring.datasource.driver-class-name}")
	String driver;
	
	/*
	@Bean
	public DataSource dataSource() {
		//obs: esse datasource nao eh recomendado em producao pois possui instanciacao simples, etc
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setDriverClassName(driver);
		
		return ds;
	}
	*/
	
	@Bean
	public DataSource hikariDataSource() {
		HikariConfig config = new HikariConfig();
		config.setUsername(username);
		config.setPassword(password);
		config.setJdbcUrl(url);
		config.setDriverClassName(driver);
		//obs: connection pool = conjunto de conexos com o banco mantidas prontas para reutilizacao, evitar ficar criando e destruindo conexoes toda hora, deixando o acesso ao banco mais eficiente
		config.setMaximumPoolSize(10); //maximo de conexoes liberadas
		config.setMinimumIdle(1); //tamanho inicial do pool
		config.setPoolName("library-db-pool"); //nome do pool. aparece no log
		config.setMaxLifetime(600000); //600.000 ms (10 min). isso significa que a duracao maxima da conexao eh 10 min, depois ela morre e cria outra
		config.setConnectionTimeout(100000); //tenta fazer a conexao nesse tempo (1.6 minutos), caso nao consiga, da timeout
		config.setConnectionTestQuery("select 1"); //so para ver se a conexao do banco esta funcionando
		return new HikariDataSource(config);
	}
}







