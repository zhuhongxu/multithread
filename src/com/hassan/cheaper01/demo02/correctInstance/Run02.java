package com.hassan.cheaper01.demo02.correctInstance;
/**
 * @author 朱红旭
 * @date 2017年5月22日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run02 {
	/**
	 *       由 A 计算，count = 4
			 由 E 计算，count = 3
			 由 D 计算，count = 2
			 由 C 计算，count = 1
			 由 B 计算，count = 0
	 结论：多个线程共同占用同一个资源，但因为使用了方法块的同步，因此读取的数据是正确的。
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月22日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		Mythread02 mythread = new Mythread02();
		Thread a = new Thread(mythread, "A");
		Thread b = new Thread(mythread, "B");
		Thread c = new Thread(mythread, "C");
		Thread d = new Thread(mythread, "D");
		Thread e = new Thread(mythread, "E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}


