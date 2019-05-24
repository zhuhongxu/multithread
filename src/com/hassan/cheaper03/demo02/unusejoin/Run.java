package com.hassan.cheaper03.demo02.unusejoin;
/**
 * @author 朱红旭
 * @date 2017年5月25日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		Mythread mythread = new Mythread();
		mythread.start();
		//Thread.sleep(?)
		System.out.println("我想等mythread对象执行完毕之后我再执行");
		System.out.println("但上面的代码中sleep()的值应该写多少呢？");
		System.out.println("答案是：我根本不能确定。");
	}
}


