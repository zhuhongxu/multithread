package com.hassan.cheaper01.demo01;
/**
 * @author 朱红旭
 * @date 2017年5月21日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class RunMythread01 {
	/**
	 * 测试mythread01.java
	 * 运行结果：	
	 			mythread01开始运行
				mythread01运行结束
				Mythread01 extends java.lang.Thread
	 * 总结：mythread01和主线程是独立的两个线程，二者并行运行。
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月21日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		Mythread01 mythread01 = new Mythread01();
		System.out.println("mythread01开始运行");
		mythread01.start();
		System.out.println("mythread01运行结束");
	}
}


