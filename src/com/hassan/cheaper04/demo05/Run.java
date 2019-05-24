package com.hassan.cheaper04.demo05;
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
			ThreadA ta = new ThreadA(service);
			ta.setName("ta");
			ThreadB tb = new ThreadB(service);
			tb.setName("tb");
			ta.start();
			tb.start();
			Thread.sleep(3000);
			service.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


