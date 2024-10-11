package com.boram.common;

public class HjCategoryDTO {

    private int ref;
    private int code;
    private String name;

    public HjCategoryDTO() {}

    public HjCategoryDTO(int ref, int code, String name) {
        this.ref = ref;
        this.code = code;
        this.name = name;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HjCategoryDTO{" +
                "ref=" + ref +
                ", code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
