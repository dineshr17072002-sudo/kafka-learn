package com.example.kafkalearn.Entity;

public class producer {
    public String sendmsg(){
        String msg="hello da";
        System.out.println("producer sent:" + msg);
        return msg;
    }
}
