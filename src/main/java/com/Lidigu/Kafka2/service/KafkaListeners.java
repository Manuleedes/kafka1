package com.Lidigu.Kafka2.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "leedes",
    groupId = "One")
    void listener(String data){
        System.out.println("received:" + data + ":>");
    }
}
