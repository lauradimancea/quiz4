package com.example.quiz4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sum")
public class SumController {

    @GetMapping(path = "/add/first/{first}/second/{second}")
    public int sum(@PathVariable int first,
                   @PathVariable int second) {
        return first+second;
    }
}
