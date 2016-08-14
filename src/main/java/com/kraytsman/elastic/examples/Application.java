package com.kraytsman.elastic.examples;

import com.kraytsman.elastic.examples.config.ElasticConfigs;
import com.kraytsman.elastic.examples.config.ElasticProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {

    static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(ElasticProperties.class, ElasticConfigs.class);
        context.getBean(ElasticProperties.class);
    }

}
