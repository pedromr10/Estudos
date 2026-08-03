package com.pedro.arquiteturaspring.montadora.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.arquiteturaspring.montadora.CarroStatus;
import com.pedro.arquiteturaspring.montadora.Chave;
import com.pedro.arquiteturaspring.montadora.HondaHRV;
import com.pedro.arquiteturaspring.montadora.Motor;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {
	
	@Autowired //faz com que o spring procure o bean e coloque na variavel
	@Qualifier("motorAspirado") //utilizado para dizer ao spring qual bean especifico utilizar na injecao. acontece com beans do mesmo tipo
	private Motor motor;

	
	@PostMapping
	public CarroStatus ligarCarro(@RequestBody Chave chave) {
		var carro = new HondaHRV(motor);
		return carro.darIgnicao(chave);
	}
}
