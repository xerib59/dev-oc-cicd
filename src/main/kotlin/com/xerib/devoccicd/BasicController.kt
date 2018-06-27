package com.xerib.devoccicd

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicController {

    @GetMapping("/hello")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
             "Hello, $name"

}