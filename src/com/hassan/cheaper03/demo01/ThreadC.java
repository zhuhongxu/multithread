package com.hassan.cheaper03.demo01;
/**
 * @author 朱红旭
 * @date 2017年5月24日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class ThreadC extends Thread {
		private Customer customer;
		public ThreadC(Customer customer) {
			super();
			this.customer = customer;
		}
		@Override
		public void run() {
			while(true){
				customer.getValue();
			}
		}
}


