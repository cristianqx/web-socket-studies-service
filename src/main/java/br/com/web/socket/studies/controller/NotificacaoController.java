package br.com.web.socket.studies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.web.socket.studies.entity.Notificacoes;

@RestController
public class NotificacaoController {
	
	@Autowired 
	private SimpMessagingTemplate template;
	
	//inicializa notificação
	private Notificacoes notificacoes = new Notificacoes(0);
	
	@GetMapping("/notify")
	public String getNotificacoes() {	
		// Incrementar notificação em um
		notificacoes.increment();
		
		// Retorna as notificações para front-end
	    template.convertAndSend("/topic/notification", notificacoes);
	    
	    return "Notificações enviadas com sucesso para Angular!";
	}
	
}
