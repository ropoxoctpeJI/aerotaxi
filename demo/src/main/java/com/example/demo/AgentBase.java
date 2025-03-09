package com.example.demo;

import akka.actor.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
// НЕДОДЕЛАНО!!!
public abstract class AgentBase {
    /*
    private static final Logger logger = Logger.getLogger(AgentBase.class.getName());

    protected String name = "Базовый агент";
    //protected Scene scene;
    protected AgentsDispatcher dispatcher;
    //protected BaseEntity entity;
    protected Map<MessageType, MessageHandler> handlers = new HashMap<>();

    public void initialize() {
        subscribe(MessageType.INIT_MESSAGE, this::handleInitMessage);
    }

    public void subscribe(MessageType msgType, MessageHandler handler) {
        if (handlers.containsKey(msgType)) {
            logger.log(Level.WARNING, "Повторная подписка на сообщение: {0}", msgType);
        }
        handlers.put(msgType, handler);
    }

    public void receiveMessage(Message message, ActorRef sender) {
        logger.log(Level.FINE, "{0} получил сообщение: {1}", new Object[]{name, message});
        if (message instanceof ActorExitRequest) {
            logger.log(Level.INFO, "{0} получил сообщение {1} - ActorExitRequest", new Object[]{this, message});
            return;
        }

        if (message instanceof Message) {
            //MessageType messageType = ((Message) message).getMsgType();
            if (handlers.containsKey(messageType)) {
                try {
                    handlers.get(messageType).handle((Message) message, sender);
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.log(Level.SEVERE, e.toString(), e);
                }
            } else {
                logger.log(Level.WARNING, "{0} Отсутствует подписка на сообщение: {1}", new Object[]{name, messageType});
            }
        } else {
            logger.log(Level.SEVERE, "{0} Неверный формат сообщения: {1}", new Object[]{name, message});
        }
    }

    @FunctionalInterface
    interface MessageHandler {
        void handle(Message message, ActorAddress sender);
    }

    protected void handleInitMessage(Message message, ActorAddress sender) {
        Map<String, Object> messageData = message.getMsgBody();
        scene = (Scene) messageData.get("scene");
        dispatcher = (AgentsDispatcher) messageData.get("dispatcher");
        entity = (BaseEntity) messageData.get("entity");
        name += " " + entity.getName();
        logger.log(Level.INFO, "{0} проинициализирован", name);
    }

    @Override
    public String toString() {
        return name;
    }
     */
}
