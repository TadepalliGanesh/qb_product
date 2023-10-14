package com.example.cart.order.helloService;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloService {


    private final KafkaTemplate<String, String> kafkaTemplate;

    public HelloService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send("hello_topic", message);
    }

//    @KafkaListener(topics="hello_topic")
    public void receiveMessage(String message) {
        System.out.println(message);
    }

    }
