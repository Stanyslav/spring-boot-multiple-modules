package ru.example.migrate;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication(scanBasePackages={"ru.example.migrate"})
@ComponentScan
@EntityScan(basePackages="ru.example.migrate")
@EnableAutoConfiguration
public class MigrateAutoConfiguration{

}