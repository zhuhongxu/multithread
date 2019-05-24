package com.hassan.cheaper02.demo01.errorInstance;
/**
 * @author 朱红旭
 * @date 2017年5月23日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class ThreadA extends Thread {
	private CommonClass commonClass;
	public ThreadA(CommonClass commonClass) {
		this.commonClass = commonClass;
	}
	@Override
	public void run() {
		super.run();
		commonClass.addI("a");
	}
}


