package com.kushat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
open class RestaurantExtension

fun main(args: Array<String>) {
    runApplication<RestaurantExtension>(*args)
}