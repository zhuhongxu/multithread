package com.hassan.cheaper04.demo03;
/**
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA tA = new ThreadA(service);
		tA.start();
	}
}


