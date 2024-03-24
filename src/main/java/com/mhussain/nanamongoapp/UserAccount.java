package com.mhussain.nanamongoapp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
@ToString
public class UserAccount {

    @Id
    private String id;

    private String name;

    private String email;

}