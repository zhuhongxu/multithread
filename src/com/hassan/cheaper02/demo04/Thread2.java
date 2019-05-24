package com.hassan.cheaper02.demo04;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-03-08 18:55
 */

public class Thread2 extends Thread {
    Service service;
    @Override
    public void run() {
        service.m2();
    }

    public Thread2(Service service){
        this.service = service;
    }
}
