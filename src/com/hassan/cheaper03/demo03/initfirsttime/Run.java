package com.hassan.cheaper03.demo03.initfirsttime;
/**
 * 解决了ThreadLocal.get()返回null的问题。
 * @author 朱红旭
 * @date 2017年5月25日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static Text t1 = new Text();
	public static void main(String[] args) {
		if (t1.get() == null) {
			System.out.println("从未放过值");
			t1.set("我的值");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
}


