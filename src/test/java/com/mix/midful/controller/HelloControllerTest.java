package com.mix.midful.controller;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

/**
 * HelloControllerTest
 *
 * @author guobin211
 * @version 0.0.1
 */
class HelloControllerTest {

    private final WebTestClient client = WebTestClient.bindToServer().baseUrl("http://localhost:8881").build();

    @Test
    void getHello() {
        System.out.println("test getHello");
        Flux<String> res = new HelloController().getHello();
        System.out.println(res);
    }
}