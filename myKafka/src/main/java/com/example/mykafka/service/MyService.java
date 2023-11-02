package com.example.mykafka.service;

import com.alibaba.fastjson.JSON;
import com.example.mykafka.kafka.pojo.UserDTO;
import com.example.mykafka.kafka.producer.KafkaProducer;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Service;

/**
 * @ClassName: Myservice
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/1
 */
@Service
public class MyService {

    private final KafkaProducer kafkaProducer;

    public MyService(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public void sendKafkaMessage(UserDTO userDTO) {
        kafkaProducer.sendMessage("test-kafka", JSON.toJSONString(userDTO));
    }
}

