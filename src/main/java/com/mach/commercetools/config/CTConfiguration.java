package com.mach.commercetools.config;

import io.sphere.sdk.client.BlockingSphereClient;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientConfig;
import io.sphere.sdk.client.SphereClientFactory;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.concurrent.TimeUnit;

@Configuration
@ComponentScan("com.mach.commercetools")
@PropertySource("classpath:/commercetools.properties")
@ConfigurationProperties
@Setter
public class CTConfiguration {

    private String projectKey;
    private String clientId;
    private String clientSecret;
    private String authUrl;
    private String apiUrl;
    private long defaultTimeoutMillis;

    @Bean(destroyMethod = "close")
    public BlockingSphereClient sphereClient() {
        SphereClientConfig clientConfig = SphereClientConfig.of(projectKey, clientId, clientSecret, authUrl, apiUrl);
        SphereClient sphereClient = SphereClientFactory.of().createClient(clientConfig);
        return BlockingSphereClient.of(sphereClient, defaultTimeoutMillis, TimeUnit.MILLISECONDS);
    }
}
