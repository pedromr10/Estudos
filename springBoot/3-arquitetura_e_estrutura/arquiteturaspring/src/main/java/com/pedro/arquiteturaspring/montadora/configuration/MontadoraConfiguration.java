package com.pedro.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pedro.arquiteturaspring.montadora.Motor;
import com.pedro.arquiteturaspring.montadora.TipoMotor;

@Configuration //utilizando a annotation o spring consegue identificar, escanear a classe como configuracao
public class MontadoraConfiguration {
	
	@Bean(name = "motorAspirado") //objeto que o Spring cria, gerencia e injeta automaticamente
	public Motor motorAspirado() {
		var motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("XPTO-0");
		motor.setLitragem(2.0);
		motor.setTipo(TipoMotor.ASPIRADO);
		return motor;
	}
	
	@Bean(name = "motorEletrico")
	public Motor motorEletrico() {
		var motor = new Motor();
		motor.setCavalos(110);
		motor.setCilindros(3);
		motor.setModelo("TH-10");
		motor.setLitragem(1.4);
		motor.setTipo(TipoMotor.ELETRICO);
		return motor;
	}
	
	@Bean(name = "motorTurbo")
	public Motor motorTurbo() {
		var motor = new Motor();
		motor.setCavalos(180);
		motor.setCilindros(4);
		motor.setModelo("XPTO-01");
		motor.setLitragem(1.5);
		motor.setTipo(TipoMotor.TURBO);
		return motor;
	}
}
