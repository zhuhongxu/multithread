package com.hassan.cheaper04.demo07;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock锁的是当前的Service对象，原因是生产方法和消费方法不能同时进行（因为线程争抢cpu资源是不确定的）
 * 另外要保证生产者和消费者共享一个数据作为沟通的桥梁，那就是Common.brige。
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Service {
	private Lock lc = new ReentrantLock();
	Condition condition = lc.newCondition();
	
	//生产方法
	public void poduce(){
		try {
			lc.lock();
			if (Common.brige.equals("")) {
				//开始生产
				System.out.println("开始生产");
				Common.setBrige("Java多线程编程核心技术：" + System.currentTimeMillis());
				//生产结束
				System.out.println("生产结束");
				//生产结束后通知消费者
				System.out.println("通知消费者开始消费");
				Thread.sleep(1000);
				condition.signal();
			} else {
				//有原料，不用生产，休息，即释放锁
				condition.await();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lc.unlock();
		}
	}
	
	//消费方法
	public void consume(){
		try {
			lc.lock();
			if (!Common.brige.equals("")) {
				//开始消费
				System.out.println("开始消费：" + Common.brige);
				System.out.println("消费结束%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
				System.out.println();
				Common.setBrige("");
				//消费结束，释放资源
				condition.signal();
			}else{
				//通知生产者开始生产
				condition.await();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lc.unlock();
		}
	}
}


