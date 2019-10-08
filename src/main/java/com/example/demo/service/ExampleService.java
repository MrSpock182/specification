package com.example.demo.service;

import com.example.demo.domain.orm.Example;
import com.example.demo.domain.request.ExampleResquest;

import java.util.List;

public interface ExampleService {
    Example save(ExampleResquest resquest);

    List<Example> findAll();

    List<Example> findAll(ExampleResquest request);
}
