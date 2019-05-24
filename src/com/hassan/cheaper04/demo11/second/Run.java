package com.hassan.cheaper04.demo11.second;

/**
 * @author 朱红旭
 * @date 2017年5月28日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	
	/**
	 * 写写互斥：
	 * 		线程A 系统时间：1495946756307
			线程B 系统时间：1495946757307
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
		threadA.start();
		threadB.start();
	}
}
