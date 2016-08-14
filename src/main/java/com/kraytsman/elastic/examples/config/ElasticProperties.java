package com.kraytsman.elastic.examples.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Data
@PropertySource("classpath:application.properties")
public class ElasticProperties {


    @Value("${elastic.data.clusterName}")
    private String indexName;

    @Value("${elastic.data.typeName}")
    private String typeName;

    @Value("${elastic.data.host}")
    private String host;

    @Value("${elastic.data.transportPort}")
    private String transportPort;

    @Value("${elastic.data.publicPort}")
    private String publicPort;

    @Value("${elastic.data.clusterName}")
    private String clusterName;

    @Value("${elastic.data.settings}")
    private String settings;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
