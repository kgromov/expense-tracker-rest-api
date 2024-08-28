package com.programming.techie.expensetracker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.utility.DockerImageName;
import org.testcontainers.utility.TestcontainersConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestContainersConfiguration {

    @Bean
    @ServiceConnection
    MongoDBContainer mongoDBContainer() {
        return new MongoDBContainer(DockerImageName.parse("mongo:6.0.4"));
    }

    // should be rather renamed - but don't want to create a new class
    public static void main(String[] args) {
        SpringApplication.from(ExpenseTrackerRestApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }
}
