package com.example.demo;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

import java.util.ArrayList;

public class GreetingReceiverActor extends AbstractActor {

    private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);
    private final ArrayList<ActorRef> children = new ArrayList<>();

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, message -> {
                    handleStringMessage(message);

                    if ("CREATE_ACTOR".equals(message)) {
                        handleCreateActor();
                    }

                    else{
                        forwardToChildren(message);
                    }
                })


                .build();
    }

    private void handleStringMessage(String message) {
        log.info("Received message: {}", message);
    }

    private void handleCreateActor() {
        log.info("Trying to create a new actor...");
        try {
            ActorRef childActor = getContext().actorOf(Props.create(GreetingReceiverActor.class), "ChildActor_" + children.size());
            children.add(childActor);
            log.info("Created a new actor - {}", childActor);
        } catch (Exception e) {
            log.error("Error creating a new actor", e);
        }
    }

    private void forwardToChildren(Object message) {
        for (ActorRef child : children) {
            log.info("Forward message to - {}", child);
            child.forward(message, getContext()); // Пересылка сообщения каждому ребёнку
        }
    }


}