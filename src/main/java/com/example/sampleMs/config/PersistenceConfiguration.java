package com.example.sampleMs.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:sqlserver://localhost:1433;databaseName=conference_demo");
//        System.out.println("My custom datasource bean has been initialized and set");
//        return builder.build();
//    }

}