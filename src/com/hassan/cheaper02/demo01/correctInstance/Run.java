
package com.hassan.cheaper02.demo01.correctInstance;
/**
 * 相比错误的实例，该实例仅仅在公共类的公共方法中加入了synchronized方法。
 * 知识点：一、如果在公共方法中使用了synchronize关键字，那么当某一个线程访问该方法的时候获得的是该公共对象对象级别的锁，
 * 在当前线程没有释放锁的情况下，其他线程都处于等待状态。
 * 		     二、synchronized锁重入的意思是当一个线程拿到一个对象锁的时候，该线程在没释放该对象锁的情况下可以拿到该对象锁的
 * 内部锁，进而访问该对象内的其他synchronized方法。
 * @author 朱红旭
 * @date 2017年5月23日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	/**
	 * 运行结果：
	 * 		b set over
			b num = 200
			a set over
			a num = 100
	 结论：线程是安全的
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月23日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		CommonClass commonClass = new CommonClass();
		ThreadA threadA = new ThreadA(commonClass);
		ThreadB threadB = new ThreadB(commonClass);
		threadA.start();
		threadB.start();
	}
}


