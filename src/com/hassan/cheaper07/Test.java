package com.hassan.cheaper07;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-03-08 17:59
 */

public class Test {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();

        try {
            Thread.sleep(1000);
            System.out.println("main thread go away....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("thread1 run.....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}