package com.hassan.cheaper05.demo02;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 朱红旭
 * @date 2017年5月28日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class MyTask extends TimerTask {
	private Timer timer;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("任务执行了，时间为：" + new Date());
		timer.cancel();
	}
	
	
	public MyTask(Timer timer) {
		this.timer = timer;
	}
}


