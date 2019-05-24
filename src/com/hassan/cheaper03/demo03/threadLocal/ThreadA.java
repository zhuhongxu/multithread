package com.hassan.cheaper03.demo03.threadLocal;
/**
 * @author 朱红旭
 * @date 2017年5月25日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class ThreadA extends Thread {
	@Override
	public void run() {
			try {
				for(int i = 0; i < 100; i++){
					Tools.t1.set("ThreadA" + (i + 1));
					System.out.println("ThreadA get Value = " + Tools.t1.get());
				Thread.sleep(200);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}


