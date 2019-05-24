package com.hassan.cheaper03.demo04;
/**
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		try {
			for(int i = 0; i < 10; i++){
				System.out.println("在main线程中取得的值：" + Tools.it.get());
				Thread.sleep(100);
			}
		Thread.sleep(5000);
		ThreadA tA = new ThreadA();
		tA.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


