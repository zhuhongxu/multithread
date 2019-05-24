package com.hassan.cheaper04.demo07;
/**
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Productor extends Thread {
	private Service service;
	public Productor(Service service) {
		this.service = service;
	}
	@Override
	public void run() {
		while(true){
			service.poduce();
		}
	}
}


