package com.mix.midful.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * HelloAppCommand
 *
 * @author guobin211
 * @version 0.0.1
 */
@Component
public class HelloAppCommand implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(HelloAppCommand.class);

    private final Environment environment;

    HelloAppCommand(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("HelloAppCommand.run()...");
        System.out.println(Arrays.toString(this.environment.getActiveProfiles()));
        String data = this.environment.getProperty("data");
        logger.info("[environment]: {}", data);
    }

    private void initState() {}

    private void clearCache() {}
}
