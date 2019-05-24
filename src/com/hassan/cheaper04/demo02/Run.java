package com.hassan.cheaper04.demo02;
/**
 * 实现了同步：
 * 		线程tA开始执行methodA方法，时间：1495852469601
		线程tA执行methodA方法结束，时间：1495852474602
		线程tAA开始执行methodA方法，时间：1495852474602
		线程tAA执行methodA方法结束，时间：1495852479603
		线程tB开始执行methodA方法，时间：1495852479603
		线程tB执行methodA方法结束，时间：1495852484604
		线程tBB开始执行methodA方法，时间：1495852484604
		线程tBB执行methodA方法结束，时间：1495852489604
		线程tA开始执行methodA方法，时间：1495852469601
		线程tA执行methodA方法结束，时间：1495852474602
		线程tAA开始执行methodA方法，时间：1495852474602
		线程tAA执行methodA方法结束，时间：1495852479603
		线程tB开始执行methodA方法，时间：1495852479603
		线程tB执行methodA方法结束，时间：1495852484604
		线程tBB开始执行methodA方法，时间：1495852484604
		线程tBB执行methodA方法结束，时间：1495852489604
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA tA = new ThreadA(service);
		ThreadA tAA = new ThreadA(service);
		ThreadA tB = new ThreadA(service);
		ThreadA tBB = new ThreadA(service);
		tA.setName("tA");
		tAA.setName("tAA");
		tB.setName("tB");
		tBB.setName("tBB");
		tA.start();
		tAA.start();
		tB.start();
		tBB.start();
	}
}


