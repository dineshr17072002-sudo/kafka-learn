package com.example.kafkalearn.Service;

import com.example.kafkalearn.Entity.User;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;


import org.springframework.kafka.annotation.KafkaListener;

@Service
    public class ConsumerSer {

    @KafkaListener(topics = "my-first-topic", groupId = "my-group")
    public void consume(
            User user,
            @Header(value = KafkaHeaders.RECEIVED_KEY, required = false) String key,
            @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
            @Header(KafkaHeaders.OFFSET) long offset) {

        System.out.println(
                "Received: " + user.getName()
                        + " | Key: " + key
                        + " | Partition: " + partition
                        + " | Offset: " + offset
        );
    }
    }


