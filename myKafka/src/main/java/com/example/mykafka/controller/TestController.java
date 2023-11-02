package com.example.mykafka.controller;

import com.example.mykafka.kafka.pojo.UserDTO;
import com.example.mykafka.service.MyService;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: TestController
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/1
 */
@Controller
public class TestController {
    @Autowired
    MyService service;


    @GetMapping(path = "/test")

    public String getTest(){
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(12);
        userDTO.setName("why");
        userDTO.setCardId("111133322");
        service.sendKafkaMessage(userDTO);
        return "heihei";
    }

    @GetMapping(path = "/test/heihei")
    @ResponseBody
    public String Test(){
        return "heihei";
    }
}
