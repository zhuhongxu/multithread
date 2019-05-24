package com.hassan.cheaper06.demo01;
/**
 * @author 朱红旭
 * @date 2017年5月29日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}


