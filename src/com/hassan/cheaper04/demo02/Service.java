package com.hassan.cheaper04.demo02;

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
	public void methodA() {
		try {
			lc.lock();
			System.out.println("线程" + Thread.currentThread().getName() + "开始执行methodA方法，时间：" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("线程" + Thread.currentThread().getName() + "执行methodA方法结束，时间：" + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lc.unlock();
		}
	}
	
	public void methodB() {
		try {
			lc.lock();
			System.out.println("线程" + Thread.currentThread().getName() + "开始执行methodB方法，时间：" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("线程" + Thread.currentThread().getName() + "执行methodB方法结束，时间：" + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lc.unlock();
		}
	}
}


