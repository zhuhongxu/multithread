package com.hassan.cheaper01.demo01;
/**
 * 自定义线程的第一种方法：继承java.lang.Thread类
 * 			   第二种方法：实现java.lang.Runnable接口
 * tip:	源码中java.lang.Thread类是这样定义的：
 * 				public class Thread implements Runnable {}
 * @author 朱红旭
 * @date 2017年5月21日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Mythread01 extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("Mythread01 extends java.lang.Thread");
	}
}


