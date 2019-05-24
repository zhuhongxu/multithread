package com.hassan.cheaper03.demo01;
/**
 * @author 朱红旭
 * @date 2017年5月24日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Producer {
	private String lock;
	public Producer(String lock) {
		this.lock = lock;
	}
	public void setValue() {
		try {
			synchronized (lock) {
				if (!ValueObject.value.equals("")) {
					lock.wait();
				}
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				System.out.println("set 的值是：" + value);
				ValueObject.value = value;
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


