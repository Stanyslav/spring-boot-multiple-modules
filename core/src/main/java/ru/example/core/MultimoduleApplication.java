package ru.example.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ru.example")
@EntityScan(basePackages="ru.example")
@EnableAutoConfiguration
public class MultimoduleApplication {

	private static final Logger log = LoggerFactory.getLogger(MultimoduleApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MultimoduleApplication.class, args);
		ModuleService service = context.getBean(ModuleService.class);
		log.info(service.getModuleList().toString());

		for (ModuleInterface module : service.getModuleList()) {
			log.info("Found module "+ module.getName());
		}
	}
}
