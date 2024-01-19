package com.jaystar.dto;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
public class MyProfileForm extends MyForm {

    private String name;

    private String phoneNumber;
}
