package com.Bosonit.ApacheKafkaJuanRodrigo.controller;


import com.Bosonit.ApacheKafkaJuanRodrigo.Kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("kafka/checkpoint")
public class MessageController {
    @Autowired
    KafkaProducer kafkaProducer;


    @PostMapping
    public ResponseEntity<String>publish(@RequestParam String message){

       kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message was sent to the topic");

    }

}
