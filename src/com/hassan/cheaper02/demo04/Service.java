package com.hassan.cheaper02.demo04;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-03-08 18:51
 */

public class Service {

    synchronized public static void m1(){
        try {
            Thread.sleep(4000);
            System.out.println("m1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    synchronized public void m2(){
        System.out.println("m2");
    }
}
