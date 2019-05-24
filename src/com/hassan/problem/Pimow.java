package com.hassan.problem;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-03-12 10:43
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Pimow {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition conditionA = lock.newCondition();
    private static int i = 0;

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        new Thread(() -> {
            lock.lock();
            try {
                if (i != 100) {
                    conditionA.await();
                }
                System.out.println("到了100");
                conditionA.signal();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            lock.lock();
            try {
                while (i <= 10000) {
                    System.out.println(i);
                    if (i == 100) {
                        conditionA.await();
                    }
                    i++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();


    }
}
