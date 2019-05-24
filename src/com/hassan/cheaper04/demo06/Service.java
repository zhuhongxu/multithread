package com.hassan.cheaper04.demo06;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Service {
	private Lock lc = new ReentrantLock();
	Condition conditionA = lc.newCondition();
	Condition conditionB = lc.newCondition();
	
	public void awaitA(){
		try {
			lc.lock();
			System.out.println("awaitA开始的时间：" + System.currentTimeMillis());
			conditionA.await();
			System.out.println("awaitA停止的时间：" + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lc.unlock();
		}
	}
	
	public void awaitB(){
		try {
			lc.lock();
			System.out.println("awaitB开始的时间：" + System.currentTimeMillis());
			conditionB.await();
			System.out.println("awaitB停止的时间：" + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lc.unlock();
		}
	}
	
	public void signalAll_A(){
		try {
			lc.lock();
			System.out.println("signalAll_A的时间：" + System.currentTimeMillis());
			conditionA.signalAll();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lc.unlock();
		}
	}
	
	
	public void signalAll_B(){
		try {
			lc.lock();
			System.out.println("signalAll_B的时间：" + System.currentTimeMillis());
			conditionB.signalAll();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lc.unlock();
		}
	}
}


