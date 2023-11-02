package com.example.mykafka.service;

import com.example.mykafka.kafka.pojo.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName: MyServiceTest
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/1
 */
@SpringBootTest
class MyServiceTest {

    @Autowired
    MyService service;
    @Test
    void sendKafkaMessage() throws InterruptedException {
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(12);
        userDTO.setName("why");
        userDTO.setCardId("111133322");
        service.sendKafkaMessage(userDTO);
    }
}