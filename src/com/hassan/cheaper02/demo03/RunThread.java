package com.hassan.cheaper02.demo03;
/**
 * volatile
 * @author 朱红旭
 * @date 2017年5月23日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class RunThread extends Thread{
	volatile private boolean isRunning = true;
	public boolean isRunning() {
		return isRunning;
	}
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	@Override
	public void run() {
		System.out.println("enter run method:");
		while(isRunning == true){
		}
		System.out.println("thread is interrupted.");
	}
}


