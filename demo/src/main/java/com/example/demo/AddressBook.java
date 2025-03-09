package com.example.demo;

import java.util.HashMap;
import java.util.logging.Logger;

public class AddressBook {
    private static final Logger logger = Logger.getLogger(AddressBook.class.getName());

    // Хранение пар сущность-адрес
    private HashMap<String, String> agentsEntities;

    public AddressBook() {
        this.agentsEntities = new HashMap<>();
    }

    public void addAgent(String entity, String address) {
        agentsEntities.put(entity, address);
    }

    public String getAddress(String entity) {
        if (!agentsEntities.containsKey(entity)) {
            logger.warning("Агент с сущностью '" + entity + "' отсутствует в адресной книге");
            return null;
        }
        return agentsEntities.get(entity);
    }

    public void clear() {
        agentsEntities.clear();
    }
}
