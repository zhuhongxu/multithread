package com.hassan.problem;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-03-08 20:51
 */

public class Demo01 {
    private static int field = 0;
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.start();
        threadB.start();
    }
}

class ThreadA extends Thread{
    Service service;
    public ThreadA(Service service){
        this.service = service;
    }
    @Override
    public void run() {
        service.set();
    }
}

class ThreadB extends Thread{
    Service service;
    public ThreadB(Service service){
        this.service = service;
    }
    @Override
    public void run() {
        service.get();
    }
}

class Service{
    private int field = 0;
    synchronized public void set(){
        for (int i = 0; i < 10001; i++){
            field = i;
            System.out.println(field);
            if (i == 100){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    synchronized  public void get(){
        try {
            if (field != 100){
                wait();
            }
            System.out.println("获取到了");
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
