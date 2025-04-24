package br.com.ifpe.oxefood.modelo.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente){

        cliente.setHabilitado(Boolean.TRUE);
        return repository.save(cliente);

        //para ficar mais facil de ler:
        
        //Cliente clienteSalvo = repository.save(cliente);
        //return clienteSalvo;
    }
    
}
