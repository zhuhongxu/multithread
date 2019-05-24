package com.hassan.cheaper04.demo06;
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
			service.signalAll_A();// 只唤醒ConditionA.await()的线程
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


