package com.jaystar.dto;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
public class MyOrderForm extends MyForm {

    private String productName;

    private Integer quantity;
}
