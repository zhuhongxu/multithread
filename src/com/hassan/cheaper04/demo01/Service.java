package com.hassan.cheaper04.demo01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Service {
	Lock lc = new ReentrantLock();
	public void testMethod (){
		lc.lock();
		for(int i = 0; i < 5; i++){
			System.out.println("当前线程名称：" + Thread.currentThread().getName() + "-" + (i + 1));
		}
		lc.unlock();
	}
}


