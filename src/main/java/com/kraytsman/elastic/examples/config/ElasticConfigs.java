package com.kraytsman.elastic.examples.config;


import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class ElasticConfigs {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private ElasticProperties elasticProperties;

    @Bean
    /** Method creates Client that connects to elasticSearch as driver
     * @return Client
     */
    public Client client() throws UnknownHostException {
        Settings settings = Settings.settingsBuilder()
                .put("cluster.name", elasticProperties.getClusterName()).build();
        return TransportClient.builder().settings(settings).build()
                .addTransportAddress(new InetSocketTransportAddress(
                        InetAddress.getByName(elasticProperties.getHost()),
                        Integer.parseInt(elasticProperties.getTransportPort())));
    }

}
