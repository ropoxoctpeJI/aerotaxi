package com.example.demo;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        // Создаем ActorSystem
        ActorSystem system = ActorSystem.create("MySystem");

        // Создаем актера GreeterActor
        ActorRef greeter = system.actorOf(Props.create(GreeterActor.class), "greeter");

        // Создаем актера GreetingReceiverActor
        ActorRef receiver = system.actorOf(Props.create(GreetingReceiverActor.class), "receiver");

        // Отправляем сообщение актеру GreeterActor
        greeter.tell("Hello World", receiver);
        greeter.tell("CREATE_ACTOR", receiver);
        greeter.tell("Forward-test", receiver);
        try {
            Thread.sleep(1000); // Ждем завершения работы актеров
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            system.terminate(); // Завершаем работу ActorSystem
        }
    }
}