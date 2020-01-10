package com.mix.midful.listener;

import com.mix.midful.config.HttpsConfig;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class HelloAppCommand implements CommandLineRunner {

    private final Environment environment;

    private final HttpsConfig httpsConfig;

    private String storage;

    HelloAppCommand(Environment environment, HttpsConfig httpsConfig) {
        this.environment = environment;
        this.httpsConfig = httpsConfig;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("HelloAppCommand.run()...");
        System.out.println(Arrays.toString(this.environment.getActiveProfiles()));
        String data = this.environment.getProperty("logging.file.path");
        log.info("[environment]: {}", data);
        log.info("[httpsConfig]: {}", httpsConfig.getPort());
        this.clearCache();
        this.initState();
        log.info("[storage]", this.storage);
    }

    private void initState() {
        this.storage = "midful" + System.currentTimeMillis();
    }

    private void clearCache() {
        this.storage = "";
    }
}
