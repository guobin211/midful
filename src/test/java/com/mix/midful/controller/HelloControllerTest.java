package com.mix.midful.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

/**
 * HelloControllerTest
 *
 * @author guobin211
 * @version 0.0.1
 */
@RunWith(SpringRunner.class)
@WebFluxTest
class HelloControllerTest {

    @Autowired
    WebTestClient webTestClient;

    @Test
    void testGetHello() {
        // request
        Flux<String> stringFlux = webTestClient.get().uri("/hello")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .returnResult(String.class)
                .getResponseBody();
        // check
        StepVerifier.create(stringFlux)
                .expectSubscription()
                .expectNext("hello webflux")
                .verifyComplete();
    }

    @Test
    void returnFlux() {
        Flux<Integer> integerFlux = webTestClient.get().uri("/hello/flux")
                .accept()
                .exchange()
                .expectStatus()
                .isOk()
                .returnResult(Integer.class)
                .getResponseBody();

        StepVerifier.create(integerFlux)
                .expectSubscription()
                .expectNext(1)
                .expectNext(2)
                .verifyComplete();
    }

    @Test
    void returnFluxStream() {
        Flux<Integer> res = webTestClient.get().uri("/hello/fluxStream")
                .accept(MediaType.valueOf(MediaType.APPLICATION_STREAM_JSON_VALUE))
                .exchange()
                .expectStatus().isOk()
                .returnResult(Integer.class)
                .getResponseBody();

        StepVerifier.create(res)
                .expectSubscription()
                .expectNext(1)
                .expectNext(2)
                .expectNext(3)
                .verifyComplete();

    }

    @Test
    void returnMono() {
        Integer expectedValue = 1;
        webTestClient.get().uri("/hello/mono")
                .accept()
                .exchange()
                .expectStatus().isOk()
                .expectBody(Integer.class)
                .consumeWith(System.out::println);

    }
}