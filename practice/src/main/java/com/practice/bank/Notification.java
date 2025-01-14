package com.practice.bank;

// 제네릭 알림 클래스
public class Notification<T> {
    private String type; // 알림 유형 (예: SMS, Email, Push)
    private T data;      // 알림 데이터

    public Notification(String type, T data) {
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "알림 유형: " + type + ", 내용: " + data;
    }
}