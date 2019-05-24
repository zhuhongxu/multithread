package com.hassan.cheaper05.demo03;

import java.util.TimerTask;

/**
 * @author 朱红旭
 * @date 2017年5月29日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Mytask extends TimerTask {
	private int i;
	
	public Mytask(int i) {
		this.i = i;
	}
	
	@Override
	public void run() {
		System.out.println("第" + i + "次没有停止成功");
	}

}


