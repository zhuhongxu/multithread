package com.hassan.cheaper01.demo02.correctInstance;
/**
 * @author 朱红旭
 * @date 2017年5月22日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Mythread02 extends Thread{
	private int count = 5;

	/**
	 * this.currentThread().getName()下面有一个黄色的下划线是因为currentThread()是父类java.lang.Thread类的静态方法，
	 * 不推荐通过对象来调用，真正正确的写法是Thread.currentThread().getName(),二者返回的结果是一样的。
	 */
	@Override
	synchronized public void run() {
		super.run();
		count--;
		System.out.println(" 由 " + this.currentThread().getName() + " 计算，count = " + count);
	}
}


