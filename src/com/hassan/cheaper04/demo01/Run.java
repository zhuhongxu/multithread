package com.hassan.cheaper04.demo01;
/**
 * 实现了同步：
 * 		当前线程名称：Thread-0-1
		当前线程名称：Thread-0-2
		当前线程名称：Thread-0-3
		当前线程名称：Thread-0-4
		当前线程名称：Thread-0-5
		当前线程名称：Thread-1-1
		当前线程名称：Thread-1-2
		当前线程名称：Thread-1-3
		当前线程名称：Thread-1-4
		当前线程名称：Thread-1-5
		当前线程名称：Thread-2-1
		当前线程名称：Thread-2-2
		当前线程名称：Thread-2-3
		当前线程名称：Thread-2-4
		当前线程名称：Thread-2-5
		当前线程名称：Thread-3-1
		当前线程名称：Thread-3-2
		当前线程名称：Thread-3-3
		当前线程名称：Thread-3-4
		当前线程名称：Thread-3-5
		当前线程名称：Thread-4-1
		当前线程名称：Thread-4-2
		当前线程名称：Thread-4-3
		当前线程名称：Thread-4-4
		当前线程名称：Thread-4-5
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		MyThread ta = new MyThread(service);
		MyThread tb = new MyThread(service);
		MyThread tc = new MyThread(service);
		MyThread td = new MyThread(service);
		MyThread te = new MyThread(service);
		ta.start();
		tb.start();
		tc.start();
		td.start();
		te.start();
	}
}


