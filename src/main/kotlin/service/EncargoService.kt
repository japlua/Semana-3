package com.JonnathanPlua.primerapi.service
import com.JonnathanPlua.primerapi.model.Encargo
import com.JonnathanPlua.primerapi.repository.EncargoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EncargoService {

    @Autowired
    lateinit var encargoRepository: EncargoRepository

    fun list(): List<Encargo>{

        return encargoRepository.findAll()
    }

}