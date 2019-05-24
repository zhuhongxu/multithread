package com.hassan.cheaper06.demo01;
/**
 * @author 朱红旭
 * @date 2017年5月29日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	/**
	 * 		1818927620
			1818927620
			1818927620
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月29日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}
}


