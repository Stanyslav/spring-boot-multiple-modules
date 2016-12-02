package ru.example.migrate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.example.core.ModuleInterface;
import ru.example.core.ModuleService;

@Component
public class MigrateModule implements ModuleInterface {

    private static final Logger log = LoggerFactory.getLogger(MigrateModule.class);

    @Autowired
    public MigrateModule(ModuleService service){
        service.register(this);
        log.info("Module constructor " + getName());
    }

    public MigrateModule(){
        log.info("Module constructor " + getName());
    }

    public void init(){
        log.info("Module init " + getName());
    }


    public void register(){
        log.info(getName() + " Construct");
    }

    @Override
    public String getName() {
        return "Migrate";
    }

    @Override
    public void install() {
        log.info(getName() + "module intalled");
    }

    @Override
    public void run() {

        log.info(getName() + " module run");
        // List<AddressObject> admins =  this.em.createQuery("from AddressObject", AddressObject.class).setMaxResults(10).getResultList();
        // log.info(admins.toString());
    }

    @Override
    public void deinstall() {
        log.info(getName() + "module deinstall");
    }
}
