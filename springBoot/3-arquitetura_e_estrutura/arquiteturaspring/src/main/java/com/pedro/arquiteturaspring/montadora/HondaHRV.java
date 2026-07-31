package com.pedro.arquiteturaspring.montadora;

import java.awt.Color;

public class HondaHRV extends Carro{
	
	public HondaHRV(Motor motor) {
		super(motor);
		setModelo("HRV");
		setCor(Color.black);
		setMontadora(Montadora.HONDA);
	}
}
