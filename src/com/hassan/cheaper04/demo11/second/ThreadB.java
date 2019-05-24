package com.hassan.cheaper04.demo11.second;
/**
 * @author 朱红旭
 * @date 2017年5月28日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class ThreadB extends Thread {
	private Service service = new Service();
	
	public ThreadB(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.write();
	}
}


