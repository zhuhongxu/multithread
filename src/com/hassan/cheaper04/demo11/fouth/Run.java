package com.hassan.cheaper04.demo11.fouth;

/**
 * @author 朱红旭
 * @date 2017年5月28日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	
	/**
	 * 写读互斥：
			方法线程A 系统时间：1495946957055
			写方法线程B 系统时间：1495946958056
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月28日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA threadA = new ThreadA(service);
		ThreadB threadB = new ThreadB(service);
		threadA.setName("A");
		threadB.setName("B");
		threadB.start();
		threadA.start();
	}
}
