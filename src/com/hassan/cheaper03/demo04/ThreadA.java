package com.hassan.cheaper03.demo04;


/**
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class ThreadA extends Thread {
	@Override
	public void run() {
			try {
				for(int i = 0; i < 10; i++){
					System.out.println("在ThreadA中取得的值：" + Tools.it.get());
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}


