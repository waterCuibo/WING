package com.ace.sbr.kafka.producer;

/**
 * Created by Administrator on 2017/4/10.
 */
public class Start {

    public static void main(String[] args) {
        ProducerUtil producerThread = new ProducerUtil();
        producerThread.start();
    }

}
