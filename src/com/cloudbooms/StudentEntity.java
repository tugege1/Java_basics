package com.cloudbooms;

import java.math.BigDecimal;

/**
 * @author Tu
 * @date 2023/5/8 10:18
 */
public class StudentEntity {

    private String code;

    private String name;

    private BigDecimal age;

    public StudentEntity() {

    }

    public StudentEntity(String code, String name, BigDecimal age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

}
