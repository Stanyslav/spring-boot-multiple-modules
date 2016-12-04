package ru.example.migrate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.example.core.ModuleInterface;

@Slf4j
@Component
public class MigrateModule implements ModuleInterface {

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("module install: {}", getName());
	}

	@Override
	public void destroy() throws Exception {
		log.info("module deinstall: {}", getName());
	}

	@Override
	public String getName() {
		return "Migrate";
	}

	@Override
	public void run() {

		log.info("module run: {}", getName());
		// List<AddressObject> admins =  this.em.createQuery("from AddressObject", AddressObject.class).setMaxResults(10).getResultList();
		// log.info(admins.toString());
	}
}
