package com.JonnathanPlua.primerapi.controllers
import com.JonnathanPlua.primerapi.model.Pedido
import com.JonnathanPlua.primerapi.service.PedidoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/diets")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class PedidoController {

    @Autowired
    lateinit var pedidoService: PedidoService

    @GetMapping
    fun list(): List<Pedido> {
        return pedidoService.list()
    }
@PostMapping
fun save(@RequestBody pedido: Pedido): Pedido {
    return pedidoService.save(pedido)
}
}