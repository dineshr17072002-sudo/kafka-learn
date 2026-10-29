package com.example.kafkalearn.Service;


import com.example.kafkalearn.Entity.User;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class producerSer {
    private final KafkaTemplate<String, User> KafkaTemplate;

    public producerSer(KafkaTemplate<String,User>KafkaTemplate){
        this.KafkaTemplate=KafkaTemplate;
    }

    public void sendmsg(User user){
        KafkaTemplate.send("my-first-topic",user.getEmail(),user);
        System.out.println("User send:"+user.getName());
    }
}
