package com.hassan.cheaper02.demo01.errorInstance;
/**
 * @author 朱红旭
 * @date 2017年5月23日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class CommonClass {
	private int num = 0;
	public void addI (String userName) {

			try {
				if ("a".equals(userName)) {
					num = 100;
					System.out.println("a set over");
					Thread.sleep(2000);
				} else{
					num = 200;
					System.out.println("b set over");
				}
				System.out.println(userName + " num = " + num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}


