package com.eds.eds.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class UserType {

    @Id
    private String id;
    private String name;
    private String description;


}