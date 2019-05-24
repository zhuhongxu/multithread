package com.hassan.cheaper06.demo01;
/**
 * @author 朱红旭
 * @date 2017年5月29日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class MyObject {
	private volatile static MyObject myObject;
	
	public static MyObject getInstance(){
		try {
			if (myObject != null) {
			}else{
				Thread.sleep(3000);
				synchronized (MyObject.class) {
					if (myObject == null) {
						myObject = new MyObject();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myObject;
	}
}


