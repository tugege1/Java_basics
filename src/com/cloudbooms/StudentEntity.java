package com.cloudbooms;

/**
 * @author Tu
 * @date 2023/5/8 10:18
 */
public class StudentEntity {

    private String code;

    private String name;

    public StudentEntity() {
    }

    public StudentEntity(String code, String name) {
        this.code = code;
        this.name = name;
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

}
