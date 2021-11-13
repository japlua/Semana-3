package com.JonnathanPlua.primerapi.model

import javax.persistence.*

@Entity
@Table (name = "producto")

class Producto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var prioridad : String? = null





}