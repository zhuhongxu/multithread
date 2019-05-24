package com.hassan.cheaper02.demo02;
/**
 * @author 朱红旭
 * @date 2017年5月23日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		Task task = new Task();
		MyThread01 myThread01 = new MyThread01(task);
		myThread01.start();
		MyThread02 myThread02 = new MyThread02(task);
		myThread02.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long beginTime = CommonUtils.beginTime1;
		if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
			beginTime = CommonUtils.beginTime2;
		}
		long endTime = CommonUtils.endTime1;
		if (CommonUtils.endTime1 < CommonUtils.endTime2) {
			endTime = CommonUtils.endTime2;
		}
		System.out.println("use time: " + ((endTime-beginTime)/1000) + "second.");
	}
}


