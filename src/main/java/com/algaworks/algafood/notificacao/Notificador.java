/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package com.algaworks.algafood.notificacao;

import com.algaworks.algafood.model.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
    
}
