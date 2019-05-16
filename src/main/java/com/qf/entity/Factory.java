package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Factory implements Serializable {
    private String id;
    private String fullName;
    private String factoryName;
    private String contractor;
    private String phone;
    private String mobile;
    private String fax;
    private String cnote;
    private String orderNo;
    private String state;

}
