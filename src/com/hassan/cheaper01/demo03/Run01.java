package com.hassan.cheaper01.demo03;
/**
 * @author 朱红旭
 * @date 2017年5月22日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run01 {
	/**
	 * 21行使用到的构造器如下：
	 * 	public Thread(Runnable target, String name) {
        	init(null, target, name, 0);
    	}
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月22日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		Mythread01 mythread01 = new Mythread01();
		Thread thread01 = new Thread(mythread01, "A");
		thread01.start();
		/**
		 * 二、isAlive()方法：判断当前的线程是否处于活动状态，那什么是活动状态呢？
		 * 				①. 线程处于开始准备运行的状态；
		 * 				②. 线程处于正在运行的状态。
		 * 注意Thread.currentThread().getName().isLive()和this.isAlive()方法
		 * 的区别，详情见page20的代码。
		 */
		System.out.println("thread01.isAlive(): " + thread01.isAlive());
		Mythread01 thread02 = new Mythread01();
		System.out.println("thread02.isAlive(): " + thread02.isAlive());
		/**
		 * 三、sleep()的作用是在指定的毫秒数内让当前正在执行的线程休眠，这个正在执行的
		 * 线程指的是this.currentThread()的线程。
		 */
		/**
		 * getId()方法的作用是取得线程的唯一标识
		 */
		System.out.println("getId(): " + Thread.currentThread().getId());
	}
}


