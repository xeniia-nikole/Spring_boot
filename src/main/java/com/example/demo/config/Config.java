package com.example.demo.config;

import com.example.demo.systemProfile.SystemProfile;
import com.example.demo.systemProfile.implemetations.DevProfile;
import com.example.demo.systemProfile.implemetations.ProductionProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev",havingValue = "true", matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev",havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
