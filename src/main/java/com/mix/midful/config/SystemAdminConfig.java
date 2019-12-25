package com.mix.midful.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * SystemAdminConfig
 *
 * @author guobin211
 * @version 0.0.1
 */
@Component
@ConfigurationProperties(prefix = "admin")
@PropertySource("classpath:config/https.yml")
@Getter
public class SystemAdminConfig {
    private String nickName;
    private String username;
    private String password;
}
