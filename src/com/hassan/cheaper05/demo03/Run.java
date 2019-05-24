package com.hassan.cheaper05.demo03;

import java.util.Date;
import java.util.Timer;

/**
 * @author 朱红旭
 * @date 2017年5月29日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	
	/**
	 * 		第1次没有停止成功
			第31575次没有停止成功
			第58807次没有停止成功
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月29日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		int i = 0;
		while(true){
			i++;
			Timer timer= new Timer();
			Mytask mytask = new Mytask(i);
			timer.schedule(mytask, new Date());
			timer.cancel();
		}
	}
}
