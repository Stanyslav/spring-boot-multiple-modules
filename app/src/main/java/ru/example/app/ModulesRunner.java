package ru.example.app;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import ru.example.core.ModuleInterface;

import java.util.Map;

@Slf4j
@Component
public class ModulesRunner implements ApplicationListener<ContextRefreshedEvent> {

	private static final Logger log = LoggerFactory.getLogger(ApplicationListener.class.getName());

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		final Map<String, ModuleInterface> modules = event.getApplicationContext()
																											.getBeansOfType(ModuleInterface.class);
		modules.forEach((key, module) -> {
			log.info("found module: {}", module.getName());
			module.run();
		});
	}
}
