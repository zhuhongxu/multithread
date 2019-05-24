package com.hassan.cheaper02.demo04;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-03-08 18:54
 */

public class Thread1 extends Thread {
    Service service;
    @Override
    public void run() {
        service.m1();
    }

    public Thread1(Service service){
        this.service = service;
    }
}
