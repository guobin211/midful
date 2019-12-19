package com.mix.midful.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * HelloAppRunner
 *
 * @author guobin211
 * @version 0.0.1
 */
@Component
public class HelloAppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("HelloAppRunner.run()...");
    }
}
