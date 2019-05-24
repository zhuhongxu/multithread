package com.hassan.cheaper04.demo04;
/**
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA threadA = new ThreadA(service);
			threadA.start();
			Thread.sleep(3000);
			service.signal();//唤醒
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


