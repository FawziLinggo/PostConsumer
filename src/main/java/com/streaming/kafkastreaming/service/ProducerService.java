package com.streaming.kafkastreaming.service;

import com.streaming.kafkastreaming.model.Kredit;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class ProducerService {
    private static final String TOPIC = "transaksi";

    @Autowired
    private KafkaTemplate<String, Kredit> kafkaTemplate;

    public void send(Kredit kredit){
        log.info("Telah melakukan Transaksi {}", kredit);
        kafkaTemplate.send(TOPIC, UUID.randomUUID().toString(),kredit);
    }
 }
