package com.mix.midful.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * HttpsConfig
 *
 * @author guobin211
 * @version 0.0.1
 */
@Component
@ConfigurationProperties(prefix = "https")
@PropertySource("classpath:config/https.yml")
@Getter
public class HttpsConfig {
    private String port;
    private String path;
}
