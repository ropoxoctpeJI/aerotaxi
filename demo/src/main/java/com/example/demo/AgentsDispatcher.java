package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
// НЕДОДЕЛАНО!!!
public class AgentsDispatcher {
    /*
    private static final Logger logger = Logger.getLogger(AgentsDispatcher.class.getName());

    private Map<BaseEntity, Agent> agentsEntities = new HashMap<>();
    private Scene scene;

    public void init(Scene scene) {
        this.scene = scene;
    }

    public boolean addEntity(BaseEntity entity) {
        String entityType = entity.getType();

        switch (entityType) {
            case "ORDER":
                createAgent(new OrderAgent(), entity);
                break;
            case "COURIER":
                createAgent(new CourierAgent(), entity);
                break;
            default:
                logger.warning("Для сущности типа " + entityType + " не указан агент");
                return false;
        }

        scene.getEntities().get(entityType).add(entity);
        return true;
    }

    private void createAgent(Agent agentClass, BaseEntity entity) {
        agentClass.initialize(this, scene, entity);
        agentsEntities.put(entity, agentClass);
    }

    public boolean removeAgent(BaseEntity entity) {
        Agent agent = agentsEntities.remove(entity);
        if (agent == null) {
            logger.severe("Агент с идентификатором " + entity.getId() + " не найден");
            return false;
        }
        // Здесь можно добавить логику удаления агента
        return true;
    }

    public List<String> getAgentsId() {
        List<String> result = new ArrayList<>();
        for (BaseEntity entity : agentsEntities.keySet()) {
            result.add(entity.getId());
        }
        return result;
    }

    public List<Agent> getAgentsAddresses() {
        return new ArrayList<>(agentsEntities.values());
    }
     */
}
