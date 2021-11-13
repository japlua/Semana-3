package com.JonnathanPlua.primerapi.service
import com.JonnathanPlua.primerapi.model.Cliente
import com.JonnathanPlua.primerapi.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClienteService {

    @Autowired
    lateinit var clienteRepository: ClienteRepository

    fun list(): List<Cliente>{

        return clienteRepository.findAll()
    }

}