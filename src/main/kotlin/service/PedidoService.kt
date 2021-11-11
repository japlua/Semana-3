package com.JonnathanPlua.primerapi.service
import com.JonnathanPlua.primerapi.model.Pedido
import com.JonnathanPlua.primerapi.repository.PedidoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PedidoService {

        @Autowired
        lateinit var pedidoRepository: PedidoRepository

        fun list(): List<Pedido> {

            return pedidoRepository.findAll()
        }
fun save(pedido:Pedido):Pedido{
    return pedidoRepository.save(pedido)
}
    }
