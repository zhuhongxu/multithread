package com.hassan.cheaper03.demo01;
/**
 * @author 朱红旭
 * @date 2017年5月24日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class ThreadP extends Thread {
	private Producer producer;
	public ThreadP(Producer producer) {
		super();
		this.producer = producer;
	}
	@Override
	public void run() {
		while(true){
			producer.setValue();
		}
	}
}


