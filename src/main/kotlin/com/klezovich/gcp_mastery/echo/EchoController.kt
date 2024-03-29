package com.klezovich.gcp_mastery.echo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class EchoController {

    @GetMapping("/echo")
    fun echo(@RequestParam(value = "message", defaultValue = "Hello World") message: String): String {
        return message
    }
}