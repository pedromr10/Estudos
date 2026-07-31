package com.pedro.arquiteturaspring.montadora;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Motor {
	private String modelo;
	private Integer cavalos;
	private Integer cilindros;
	private Double litragem;
	private TipoMotor tipo;
	
	
}
