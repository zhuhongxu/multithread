package com.hassan.cheaper04.demo08.fairlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Service {
	private Lock lc;
	public Service(boolean isFairOrNot) {
		lc = new ReentrantLock(isFairOrNot);
	}
	public void method() {
		try {
			lc.lock();
			System.out.println("线程：" + Thread.currentThread().getName() + "被锁定了");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lc.unlock();
		}
	}
	
}


