package com.hassan.cheaper02.demo03;
/**
 * @author 朱红旭
 * @date 2017年5月23日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	/**
	 * 运行结果：
	 * 			enter run method:
				已经被赋值为false
				thread is interrupted.
	 一些说明：倘若没有volatile关键字，在windows7结合JDK64bit的环境中，线程可以正常运行，
	 		   但配置Eclipse中JVM运行参数为-server时，则容易出现死循环。
	 原因如下：一般情况下，变量private boolean isRunning = true存在于公共堆栈和线程的私有堆栈中，
	 		 当配置Eclipse中JVM运行参数为-server模式时，为了线程的运行效率，线程一直从私有堆栈中取得
	 		 isRunning = true，而代码runThread.setRunning(false)虽然被执行，更新的确实共有堆栈
	 		 isRunning = flase，所以一直就是死循环状态。
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月23日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		try {
			RunThread runThread = new RunThread();
			runThread.start();
			Thread.sleep(1000);
			runThread.setRunning(false);
			System.out.println("已经被赋值为false");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


