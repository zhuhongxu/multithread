package com.hassan.cheaper04.demo08.unfairlock;
/**
 * 先运行的并不一定先拿到锁，这是不公平的
 * 	        线程Thread-4运行了
		线程Thread-6运行了
		线程Thread-5运行了
		线程Thread-0运行了
		线程Thread-1运行了
		线程Thread-2运行了
		线程Thread-3运行了
		线程：Thread-6被锁定了
		线程Thread-8运行了
		线程Thread-7运行了
		线程Thread-9运行了
		线程：Thread-8被锁定了
		线程：Thread-5被锁定了
		线程：Thread-0被锁定了
		线程：Thread-1被锁定了
		线程：Thread-2被锁定了
		线程：Thread-4被锁定了
		线程：Thread-3被锁定了
		线程：Thread-7被锁定了
		线程：Thread-9被锁定了
 思考，super()的作用？
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		final Service service = new Service(false);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("线程" + Thread.currentThread().getName() + "运行了");
				service.method();
			}
		};
		
		Thread[] threadArray = new Thread[10];
		for(int i = 0; i < threadArray.length; i++){
			threadArray[i] = new Thread(runnable);
		}
		for(int i = 0; i < threadArray.length; i++){
			threadArray[i].start();
		}
	}
}


