package com.hassan.cheaper03.demo02.usejoin;
/**
 * @author 朱红旭
 * @date 2017年5月25日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		try {
			Mythread mythread = new Mythread();
			mythread.start();
			mythread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("我想等mythread对象执行完毕之后我再执行，我做到了。");
	}
}


