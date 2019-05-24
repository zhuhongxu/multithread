package com.hassan.cheaper03.demo02.unusejoin;
/**
 * @author 朱红旭
 * @date 2017年5月25日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Mythread extends Thread {
	@Override
	public void run() {
		try {
			int secondValue = (int)(Math.random()*10000);
			System.out.println("secondValue: " + secondValue);
			Thread.sleep(secondValue);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


