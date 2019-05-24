package com.hassan.cheaper01.demo02.errorInstance;
/**
 * @author 朱红旭
 * @date 2017年5月22日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Mythread01 extends Thread{
	private int count = 5;
	@Override
	public void run() {
		super.run();
		count--;
		System.out.println(" 由 " + this.currentThread().getName() + " 计算，count = " + count);
	}
}


