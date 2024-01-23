package com.jaystar.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MySectionsSubmit {

    private List<MyProfileForm> profiles;

    private List<MyOrderForm> orders;

}
