package com.hassan.cheaper01.demo01;
/**
 * java.lang.Runnable接口中只定义了一个抽象run()方法，因此要想启动通过实现java.lang.Runnable接口创建的线程需借助Thread类。 
 *			public interface Runnable {
				    public abstract void run();
			}
 *	下面是java.lang.Thread中的一个构造器，本实例使用的正是该构造器
 *	    	public Thread(Runnable target) {
 *       		init(null, target, "Thread-" + nextThreadNum(), 0);
 *   		}
 * @author 朱红旭
 * @date 2017年5月22日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class RunMythread02 {
	/**
	 * 运行结果：
	 * 		mythread02开始运行
			mythread02运行结束
			Mythread02 implements Runnable
	 * 结论：mythread02和主线程是独立的两个线程，二者并行运行。
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月22日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		Mythread02 mythread02 = new Mythread02();
		Thread thread = new Thread(mythread02);
		System.out.println("mythread02开始运行");
		thread.start();
		System.out.println("mythread02运行结束");
	}
}


