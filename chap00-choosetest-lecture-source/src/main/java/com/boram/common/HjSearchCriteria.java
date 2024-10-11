package com.boram.common;

public class HjSearchCriteria {

    private String condition; // 검색 기준 ( 메뉴이름 혹은 카데고리 명)
    private String value; // 검색어

    public HjSearchCriteria() {}

    public HjSearchCriteria(String condition, String value) {
        this.condition = condition;
        this.value = value;
    }

    public String getCondition() {
        return condition;

        //
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HjSearchCriteria{" +
                "condition='" + condition + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
