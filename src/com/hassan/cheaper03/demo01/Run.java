package com.hassan.cheaper03.demo01;
/**
 * @author 朱红旭
 * @date 2017年5月24日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		String lock = new String("");
		Producer producer = new Producer(lock);
		Customer customer = new Customer(lock);
		ThreadP threadP = new ThreadP(producer);
		ThreadC threadC = new ThreadC(customer);
		threadP.start();
		threadC.start();
	}
}


