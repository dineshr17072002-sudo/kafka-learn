package com.example.kafkalearn.Controller;


import com.example.kafkalearn.Service.producerSer;
import com.example.kafkalearn.Entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final producerSer producerService;

    public KafkaController(producerSer producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody User user) {

        producerService.sendmsg(user);

        return "User sent successfully: " + user;
    }
}