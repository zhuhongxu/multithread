package com.hassan.cheaper01.demo02.errorInstance;
/**
 * @author 朱红旭
 * @date 2017年5月22日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run01 {
	/**
	 * 运行结果（该结果是随机的，但是出现的概率比较大）：
	 *   由 C 计算，count = 3
		  由 B 计算，count = 2
		  由 A 计算，count = 3
		  由 D 计算，count = 1
		  由 E 计算，count = 0
	 结论：多个线程共同占用同一个资源，造成了数据的脏读。
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月22日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		Mythread01 mythread = new Mythread01();
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


