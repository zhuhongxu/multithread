package com.hassan.cheaper05.demo02;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 *     public Timer() {
        	this("Timer-" + serialNumber());
    	}
    
        public Timer(String name) {
	        thread.setName(name);
	        thread.start();
    	}
 * 由以上源码可知，每次创建一个Timer对象就会创建一个新的线程，
 * 问题是在当前任务执行完毕的时候，发现该线程并没有终止而是
 * 一直处于运行状态，可以调用System.gc()来终止，但很明显这
 * 并不是一个明智的选择，但此时并没有找到判断当前任务是否执行完
 * 成的api，因此就退而求其次，将此Timer作为参数参与到任务的构造之中，
 * 然后任务执行完成就执行Timer.cancel()。
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
		Timer timer = new Timer();//任务调度器
		Date scheduleDate = calendar.getTime();//计划的时间（当前时间的十秒之后）
		MyTask myTask = new MyTask(timer);//任务
		timer.schedule(myTask, scheduleDate);
	}
}


