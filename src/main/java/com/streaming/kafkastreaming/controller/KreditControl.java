package com.streaming.kafkastreaming.controller;

import com.streaming.kafkastreaming.model.Kredit;
import com.streaming.kafkastreaming.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KreditControl {
    @Autowired
    private ProducerService producerService;
    @PostMapping("/post")
    public void kredit(@RequestBody Kredit kredit){
        producerService.send(kredit);
    }
}
