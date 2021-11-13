package com.JonnathanPlua.primerapi.controllers
import com.JonnathanPlua.primerapi.model.Producto
import com.JonnathanPlua.primerapi.service.ProductoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/producto")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ProductoController {

    @Autowired
    lateinit var productoService: ProductoService

    @GetMapping
    fun list(): List<Producto> {
        return productoService.list()
    }
@PostMapping
fun save(@RequestBody producto: Producto): Producto {
    return productoService.save(producto)
}
}
