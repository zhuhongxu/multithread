package com.hassan.cheaper04.demo03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Exception in thread "Thread-0" java.lang.IllegalMonitorStateException
	at java.util.concurrent.locks.ReentrantLock$Sync.tryRelease(Unknown Source)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.release(Unknown Source)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.fullyRelease(Unknown Source)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(Unknown Source)
	at com.hassan.cheaper04.demo03.Service.method(Service.java:18)
	at com.hassan.cheaper04.demo03.ThreadA.run(ThreadA.java:15)
 监视器状态非法，原因是必须在Conditon.await()方法调用之前抵用Lock.lock()代码获得同步监视器。66
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Service {
	private Lock lc = new ReentrantLock();
	Condition condition = lc.newCondition();
	public void method() {
		try {
			condition.await();
			System.out.println("执行此方法");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


