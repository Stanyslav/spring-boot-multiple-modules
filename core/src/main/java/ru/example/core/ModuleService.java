package ru.example.core;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ModuleService {

    private ArrayList<ModuleInterface> moduleList = new ArrayList<ModuleInterface>();


    private static final Logger log = LoggerFactory.getLogger(ModuleService.class);


    public void register(ModuleInterface module){
        moduleList.add(module);
        log.info("Register module " + module.getName());
    }

    public ArrayList<ModuleInterface> getModuleList(){
        return moduleList;
    }
}
