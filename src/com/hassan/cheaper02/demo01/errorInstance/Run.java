
package com.hassan.cheaper02.demo01.errorInstance;
/**
 * 一、“非线程安全”问题存在于“实例变量”中，如果是方法内部的私有变量，则不存在“非线程安全”问题，所以结果也就是线程安全的了（没有演示，只是一个结论）。
 * 二、如果多个线程共同访问1个对象中的实例变量，则有可能出现“非线程安全”问题（如下）。
 * @author 朱红旭
 * @date 2017年5月23日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	/**
	 * 运行结果：
	 * 		a set over
			b set over
			b num = 100
			a num = 100
	 结论：出现了线程不安全的问题
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月23日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		CommonClass commonClass = new CommonClass();
		ThreadA threadA = new ThreadA(commonClass);
		ThreadB threadB = new ThreadB(commonClass);
		threadA.start();
		threadB.start();
	}
}


