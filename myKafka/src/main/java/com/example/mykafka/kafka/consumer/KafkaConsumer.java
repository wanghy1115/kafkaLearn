package com.example.mykafka.kafka.consumer;
import com.example.mykafka.kafka.pojo.UserDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
/**
 * @ClassName: KafkaConsumer
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/1
 */


@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test-kafka",  groupId = "test1")
    public void listen(String message) {
        // 处理接收到的消息
        System.out.println("------begin------");
        System.out.println(message);
        System.out.println("-------end-------");
    }
}

