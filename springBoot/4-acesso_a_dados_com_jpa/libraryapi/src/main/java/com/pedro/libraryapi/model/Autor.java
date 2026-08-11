package com.pedro.libraryapi.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "autor")
@Getter
@Setter //gera em tempo de compilacao
@NoArgsConstructor
@AllArgsConstructor
public class Autor {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	@Column(name="nome", length = 100, nullable = false)
	private String nome;
	@Column(name = "data_nascimento", nullable = false)
	private LocalDate dataNascimento;
	@Column(name = "nacionalidade", length = 50, nullable = false)
	private String nacionalidade;
}
