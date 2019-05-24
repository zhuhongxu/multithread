package com.hassan.cheaper05.demo01;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author 朱红旭
 * @date 2017年5月28日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	/**
	 * 		当前的时间为：Sun May 28 13:31:21 CST 2017
			任务执行了，时间为：Sun May 28 13:31:31 CST 2017
	 * @param args
	 * @author 朱红旭
	 * @date 2017年5月28日
	 * @version 1.0
	 */
	public static void main(String[] args) {
		System.out.println("当前的时间为：" + new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, 10);
		Date scheduleDate = calendar.getTime();//计划的时间（当前时间的十秒之后）
		MyTask myTask = new MyTask();//任务
		Timer timer = new Timer();//任务调度器
		timer.schedule(myTask, scheduleDate);
	}
}


