package com.hassan.problem;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-03-08 21:16
 */

public class Demo02 {
    public volatile static int field = 0;
    public static void main(String[] args) {
        Thread threadA = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10001; i++){
                    field = i;
                    System.out.println(field);
                }
            }
        };

        Thread threadB = new Thread(){
            @Override
            public void run() {
                while (true){
                    if (field == 100){
                        System.out.println("field == 100");
                    }
                }
            }
        };

        threadA.start();
        threadB.start();


    }
}


