package com.streaming.kafkastreaming.model;

import lombok.Data;

@Data
public class Kredit {
    private String type;
    private String nama_bank;
    private String nama;
    private int jumlah;
}
