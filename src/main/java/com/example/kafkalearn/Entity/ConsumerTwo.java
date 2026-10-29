package com.example.kafkalearn.Entity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerTwo {

    @KafkaListener(
            topics = "my-first-topic",
            groupId = "my-group-2",
            properties = {
                    "auto.offset.reset=latest"
            }
    )
    public void receiveMessage(User user) {

        System.out.println(
                "Consumer Group 2 received: " + user.getName()
        );
    }
    }
