package com.mix.midful.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * HelloController
 * 测试api
 *
 * @author guobin211
 * @version 0.0.1
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    HelloController() {
    }

    @GetMapping("")
    public Flux<String> getHello() {
        return Flux.just("hello webflux");
    }

    @GetMapping("/block")
    public String getString() {
        try {
            log.info(dateFormat.format(System.currentTimeMillis()));
            TimeUnit.SECONDS.sleep(2);
            return "block";
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "block";
        }
    }

    @GetMapping("/flux")
    Flux<Integer> returnFlux() {
        log.info(dateFormat.format(System.currentTimeMillis()));
        return Flux.just(1, 2)
                .delayElements(Duration.ofSeconds(1))
                .log();

    }

    @GetMapping(value = "/fluxStream", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    Flux<Integer> returnFluxStream() {
        return Flux.just(1, 2, 3)
                .delayElements(Duration.ofSeconds(1))
                .log();
    }

    @GetMapping("/mono")
    Mono<Integer> returnMono() {
        return Mono.just(1).log();
    }
}
