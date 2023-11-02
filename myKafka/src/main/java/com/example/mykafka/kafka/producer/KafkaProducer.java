package com.example.mykafka.kafka.producer;
import com.example.mykafka.kafka.pojo.UserDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
/**
 * @ClassName: KafkaProducer
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/1
 */


@Service
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
