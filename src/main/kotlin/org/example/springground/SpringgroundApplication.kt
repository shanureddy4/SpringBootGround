package org.example.springground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["samplemvc", "org.example.springground"])
class SpringgroundApplication

fun main(args: Array<String>) {
    runApplication<SpringgroundApplication>(*args)
}
