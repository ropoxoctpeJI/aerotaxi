package com.example.demo;

public enum MessageType {
    INIT_MESSAGE("Инициализация"),
    PRICE_REQUEST("Запрос цены"),
    PRICE_RESPONSE("Ответ цены"),
    PLANNING_REQUEST("Запрос на размещение"),
    PLANNING_RESPONSE("Ответ на размещение");

    private final String description;

    MessageType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
