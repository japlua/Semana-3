package com.JonnathanPlua.primerapi.service
import com.JonnathanPlua.primerapi.model.Producto
import com.JonnathanPlua.primerapi.repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductoService {

        @Autowired
        lateinit var productoRepository: ProductoRepository

        fun list(): List<Producto> {

            return productoRepository.findAll()
        }
fun save(producto:Producto):Producto{
    return productoRepository.save(producto)
}
    }
