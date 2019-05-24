package com.hassan.cheaper04.demo10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.hassan.cheaper02.demo01.errorInstance.ThreadA;


/**
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	private static int bridge = 1;
	private static Lock lc = new ReentrantLock();
	private static Condition conditionA = lc.newCondition();
	private static Condition conditionB = lc.newCondition();
	private static Condition conditionC = lc.newCondition();
	
	public static void main(String[] args) {
		Thread threadA = new Thread(){
			public void run() {
				lc.lock();
				try {
					if (bridge != 1) {
						conditionA.await();
					}
					for(int i = 0; i < 3; i++){
						System.out.println("线程" + Thread.currentThread().getName() + " 值：" + (i+1));
					}
					bridge = 2;
					conditionB.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lc.unlock();
				}
			};
		};
		
		
		Thread threadB = new Thread(){
			public void run() {
				lc.lock();
				try {
					if (bridge != 2) {
						conditionA.await();
					}
					for(int i = 0; i < 3; i++){
						System.out.println("线程" + Thread.currentThread().getName() + " 值：" + (i+1));
					}
					bridge = 3;
					conditionC.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lc.unlock();
				}
			};
		};
		
		
		
		Thread threadC = new Thread(){
			public void run() {
				lc.lock();
				try {
					if (bridge != 3) {
						conditionA.await();
					}
					for(int i = 0; i < 3; i++){
						System.out.println("线程" + Thread.currentThread().getName() + " 值：" + (i+1));
					}
					bridge = 1;
					conditionA.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lc.unlock();
				}
			};
		};		
		Thread[] a = new Thread[5];
		Thread[] b = new Thread[5];
		Thread[] c = new Thread[5];
		for(int i = 0; i < 5; i++){
			a[i] = new Thread(threadA);
			b[i] = new Thread(threadB);
			c[i] = new Thread(threadC);
			a[i].start();
			b[i].start();
			c[i].start();
		}
	}
}


