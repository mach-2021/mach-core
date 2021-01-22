package com.mach.algolia.config;

import com.algolia.search.DefaultSearchClient;
import com.algolia.search.SearchClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.mach.algolia")
@PropertySource("classpath:/algolia.properties")
@ConfigurationProperties
public class AlgoliaConfiguration {

    private String applicationId;
    private String apiKey;

    @Bean(destroyMethod = "close")
    public SearchClient searchClient() {
        return DefaultSearchClient.create(applicationId, apiKey);
    }
}
