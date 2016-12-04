package ru.example.migrate;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {MigrateModule.class})
@EntityScan(basePackages = "ru.example.migrate")
public class MigrateAutoConfiguration {
}