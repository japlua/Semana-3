package com.JonnathanPlua.primerapi.repository

import com.JonnathanPlua.primerapi.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository : JpaRepository<Cliente,Long>{
    
    
    
}