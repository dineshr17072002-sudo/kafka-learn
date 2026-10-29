package com.example.kafkalearn;

import com.example.kafkalearn.Entity.consumer;
import com.example.kafkalearn.Entity.producer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaLearnApplication.class, args);
        producer p=new producer();
        consumer c=new consumer();
        String message=p.sendmsg();
        c.receivemsg(message);
    }

}
