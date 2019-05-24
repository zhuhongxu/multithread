package com.hassan.cheaper02.demo02;

/**
 * @author 朱红旭
 * @date 2017年5月23日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Task {
	private String getData1;
	private String getData2;

	/**
	 * 本例子中使用代码块的同步而不是方法的同步是因为私有变量不会
	 * 有线程不安全的问题，我们应该把sychronized尽可能用到可能会
	 * 发生线程不安全的 地方，因为synchronized在一定程度上会降低
	 * 代码的效率。
	 * @author 朱红旭
	 * @date 2017年5月23日
	 * @version 1.0
	 */
	public void doLongTimeTask() {
		try {

			System.out.println("begin task");
			Thread.sleep(3000);
			String privateGetData1 = "deal a long time task and return value1: "
					+ Thread.currentThread().getName();
			String privateGetData2 = "deal a long time task and return value2: "
					+ Thread.currentThread().getName();
			synchronized(this){
				getData1 = privateGetData1;
				getData2 = privateGetData2;
			}
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
