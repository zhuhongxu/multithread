package com.hassan.cheaper04.demo12;

/**
 * @author 朱红旭
 * @date 2017年5月28日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	
	/**
	 * 看控制台的打印情况解释了为什么ReentrantReadWriteLock比ReentrantLock优秀的地方：
	 * 			写方法线程B 系统时间：1495947461351
				读方法线程A 系统时间：1495947464351
				读方法线程C 系统时间：1495947464352
		当同时有比较多的线程去读取和写入同一资源的时候，使用ReentrantReadWriteLock会显著提高读的效率。
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
		ThreadC threadC = new ThreadC(service);
		threadC.setName("C");
		threadC.start();
	}
}
