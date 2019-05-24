package com.hassan.cheaper02.demo05;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-03-08 20:08
 */


public class Service {
    private volatile   static  int field = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++){
                    field++;
                }
            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++){
                    field++;
                }
            }
        }).start();


        Thread.sleep(3000);

        System.out.println(field);
    }
}
