package com.example.cloud.business.number;

import org.junit.Test;

import java.util.UUID;

public class UUIDtest {

    @Test
    public void test(){
        String s = UUID.randomUUID().toString().replace("-","");
        System.out.println(s);
    }
}
