package com.hassan.cheaper04.demo11.first;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author 朱红旭
 * @date 2017年5月28日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Service {
	private ReentrantReadWriteLock lc = new ReentrantReadWriteLock();

	public void read() {
		try {
			lc.readLock().lock();
			System.out.println("线程" + Thread.currentThread().getName() + " 系统时间：" + System.currentTimeMillis());
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lc.readLock().unlock();
		}
	}
}
