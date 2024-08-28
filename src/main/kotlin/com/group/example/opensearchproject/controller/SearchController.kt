package com.group.example.opensearchproject.controller

import com.group.example.opensearchproject.dto.ExampleRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchController {

    @GetMapping("/get_example")
    fun getExample(): String {
        return "get_return"
    }

    @PostMapping("/post_example")
    fun postExample(@RequestBody requestBody: ExampleRequest): String {
        return "post_return"
    }
}
