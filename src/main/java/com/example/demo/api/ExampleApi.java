package com.example.demo.api;

import com.example.demo.domain.orm.Example;
import com.example.demo.domain.request.ExampleResquest;
import com.example.demo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExampleApi {

    @Autowired
    private ExampleService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/get")
    public List<Example> get() {
        return service.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/post")
    public List<Example> post(@RequestBody ExampleResquest request) {
        return service.findAll(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/save")
    public Example save(@RequestBody ExampleResquest request) {
        return service.save(request);
    }

}
