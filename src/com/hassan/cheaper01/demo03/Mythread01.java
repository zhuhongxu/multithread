package com.hassan.cheaper01.demo03;
/**
 * @author 朱红旭
 * @date 2017年5月22日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Mythread01 extends Thread{
	/**
	 * java.lang.Thread.currentThread().getName(): A
	 * 一、java.lang.Thread.currentThread().getName():获取当前线程的名称。
	 */
	@Override
	public void run() {
		super.run();
		System.out.println("java.lang.Thread.currentThread().getName(): " + java.lang.Thread.currentThread().getName());
	}
}


