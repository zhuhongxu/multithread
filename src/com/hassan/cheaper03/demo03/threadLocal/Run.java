package com.hassan.cheaper03.demo03.threadLocal;
/**
 * @author 朱红旭
 * @date 2017年5月25日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
			try {
				for(int i = 0; i < 100; i++){
					Tools.t1.set("Main" + (i + 1));
					System.out.println("main get value = " + Tools.t1.get());
					Thread.sleep(200);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}


