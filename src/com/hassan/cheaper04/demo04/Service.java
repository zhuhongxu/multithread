package com.hassan.cheaper04.demo04;

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
	Condition condition = lc.newCondition();
	
	//停止方法
	public void await(){
		try {
			lc.lock();
			System.out.println("停止的时间：" + System.currentTimeMillis());
			condition.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lc.unlock();
		}
	}
	
	//唤醒方法
	public void signal(){
		try {
			lc.lock();
			System.out.println("唤醒的时间：" + System.currentTimeMillis());
			condition.signal();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lc.unlock();
		}
	}
}


