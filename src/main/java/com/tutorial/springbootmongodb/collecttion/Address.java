package com.tutorial.springbootmongodb.collecttion;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {

    private String address1;
    private String getAddress2;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "address1='" + address1 + '\'' +
                ", getAddress2='" + getAddress2 + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
