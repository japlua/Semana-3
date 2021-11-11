package com.JonnathanPlua.primerapi.controllers
import com.JonnathanPlua.primerapi.model.Encargo
import com.JonnathanPlua.primerapi.service.EncargoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/workouts")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class EncargoController {

    @Autowired
    lateinit var encargoService: EncargoService

    @GetMapping
    fun list(): List<Encargo>{
        return encargoService.list()
    }

}