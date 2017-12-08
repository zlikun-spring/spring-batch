package com.zlikun.spring.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2017-12-08 16:45
 */
@Data
public class CreditBill {

    private String accountId ;
    private String name ;
    private double amount ;
    private String date ;
    private String address ;

}
