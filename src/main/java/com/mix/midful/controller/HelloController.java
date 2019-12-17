package com.mix.midful.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * HelloController
 * 测试api
 * @author guobin211
 * @version 0.0.1
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    HelloController() {}

    public Flux<String> getHello() {
        return Flux.just("hello webflux");
    }
}
