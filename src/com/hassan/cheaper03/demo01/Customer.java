package com.hassan.cheaper03.demo01;
/**
 * @author 朱红旭
 * @date 2017年5月24日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Customer {
	private String lock;
	public Customer(String lock) {
		this.lock = lock;
	}
	public void getValue (){
		try {
			synchronized (lock) {
				if (ValueObject.value.equals("")) {
					lock.wait();
				}
				System.out.println("get 的值是：" + ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


