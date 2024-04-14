package com.afuentes.curso.spring.interceptor.springbootinterceptor.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class FooController {

    @GetMapping("/foo")
    public Map<String, String> foo() {

        return Collections.singletonMap("message", "hadler foo del controlador");
    }

    @GetMapping("/bar")
    public Map<String, String> bar() {

        return Collections.singletonMap("message", "hadler bar del controlador");
    }

    @GetMapping("/baz")
    public Map<String, String> baz() {

        return Collections.singletonMap("message", "hadler baz del controlador");
    }
}
