package com.pedro.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pedro.arquiteturaspring.montadora.Motor;
import com.pedro.arquiteturaspring.montadora.TipoMotor;

@Configuration //utilizando a annotation o spring consegue identificar, escanear a classe como configuracao
public class MontadoraConfiguration {
	
	@Bean //objeto que o Spring cria, gerencia e injeta automaticamente
	public Motor motor() {
		var motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("XPTO-0");
		motor.setLitragem(2.0);
		motor.setTipo(TipoMotor.ASPIRADO);
		return motor;
	}
}
