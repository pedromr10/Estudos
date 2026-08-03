package com.pedro.todo;

import org.springframework.stereotype.Component;

@Component
public class MailSender {
	
	public void enviar(String mensagem) {
		System.out.println("Email enviado: " + mensagem);
	}
}
