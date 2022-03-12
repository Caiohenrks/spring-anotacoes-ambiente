package com.algaworks.algafood.service;

import com.algaworks.algafood.model.Cliente;
import com.algaworks.algafood.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    
    //@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    //@Autowired
    private Notificador notificador;
    
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativar(Cliente cliente) {
        cliente.ativar();
        
            eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

        //notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
