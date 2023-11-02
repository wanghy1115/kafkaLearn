package com.example.mykafka.kafka.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: UserDTO
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/1
 */
@Data
public class UserDTO implements Serializable {

    private String name;

    private String cardId;

    private Integer age;
}
