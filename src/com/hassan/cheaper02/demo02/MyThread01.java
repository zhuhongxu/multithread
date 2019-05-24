package com.hassan.cheaper02.demo02;
/**
 * @author 朱红旭
 * @date 2017年5月23日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class MyThread01 extends Thread {
	private Task task;
	public MyThread01(Task task) {
		super();
		this.task = task;
	}
	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}
}


