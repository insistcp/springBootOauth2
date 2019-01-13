package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;

import javax.sql.DataSource;


public class ApplyClientDetailService implements ClientDetailsService {
    @Autowired
    private DataSource dataSource;
    @Override
    public ClientDetails loadClientByClientId(String name) throws ClientRegistrationException {
        JdbcClientDetailsService clientDetailsService = new JdbcClientDetailsService(dataSource);
        ClientDetails clientDetails = clientDetailsService.loadClientByClientId(name);
        return clientDetails;
    }
}