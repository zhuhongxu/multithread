package com.hassan.cheaper04.demo01;
/**
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class MyThread extends Thread {
	private Service service;
	public MyThread(Service service) {
		// TODO Auto-generated constructor stub
		this.service = service;
	}
	@Override
	public void run() {
		service.testMethod();
	}
}


