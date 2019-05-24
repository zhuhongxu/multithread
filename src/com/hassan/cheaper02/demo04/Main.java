package com.hassan.cheaper02.demo04;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-03-08 18:55
 */

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        Thread1 thread1 = new Thread1(service);
        Thread2 thread2 = new Thread2(service);
        thread1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
