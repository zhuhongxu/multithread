package com.hassan.problem;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-03-08 21:32
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo03 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Service1 service1 = new Service1(lock);
        Thread1 thread1 = new Thread1(service1);
        Thread2 thread2 = new Thread2(service1);
        thread1.start();
        try {
            Thread.sleep(50);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Thread1 extends Thread{
    public Service1 service1;

    public Thread1(Service1 service1){
        this.service1 = service1;
    }

    @Override
    public void run() {
        service1.setData();
    }
}

class Thread2 extends Thread{
    public Service1 service1;

    public Thread2(Service1 service1){
        this.service1 = service1;
    }

    @Override
    public void run() {
        service1.getData();
    }
}


class Service1{
    public static int field = 0;

    private Lock lock;

    private Condition condition;

    public Service1(Lock lock){
        this.lock = lock;
        this.condition = lock.newCondition();
    }

    public void setData(){
        lock.lock();
        for (int i = 0; i < 10001; i++){
            field = i;
            System.out.println(field);
            if (field == 100){
                condition.signalAll();
            }
        }
        lock.unlock();
    }



    public void getData(){
        lock.lock();
        try {
            condition.await();
            System.out.println("field == 100");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
