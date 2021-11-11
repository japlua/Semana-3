package com.JonnathanPlua.primerapi.repository

import com.JonnathanPlua.primerapi.model.Pedido
import org.springframework.data.jpa.repository.JpaRepository

interface PedidoRepository : JpaRepository<Pedido,Long>{
    
    
    
}