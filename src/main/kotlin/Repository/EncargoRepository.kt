package com.JonnathanPlua.primerapi.repository

import com.JonnathanPlua.primerapi.model.Encargo
import org.springframework.data.jpa.repository.JpaRepository

interface EncargoRepository : JpaRepository<Encargo,Long>{
    
    
    
}