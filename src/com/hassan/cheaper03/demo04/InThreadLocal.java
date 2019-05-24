package com.hassan.cheaper03.demo04;

import java.util.Date;

/**
 *public class InThreadLocal extends InheritableThreadLocal时的运行结果：
 * 		在main线程中取得的值：1495849305347
		在main线程中取得的值：1495849305347
		在main线程中取得的值：1495849305347
		在main线程中取得的值：1495849305347
		在main线程中取得的值：1495849305347
		在main线程中取得的值：1495849305347
		在main线程中取得的值：1495849305347
		在main线程中取得的值：1495849305347
		在main线程中取得的值：1495849305347
		在main线程中取得的值：1495849305347
		在ThreadA中取得的值：1495849305347
		在ThreadA中取得的值：1495849305347
		在ThreadA中取得的值：1495849305347
		在ThreadA中取得的值：1495849305347
		在ThreadA中取得的值：1495849305347
		在ThreadA中取得的值：1495849305347
		在ThreadA中取得的值：1495849305347
		在ThreadA中取得的值：1495849305347
		在ThreadA中取得的值：1495849305347
		在ThreadA中取得的值：1495849305347
 &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
 public class InThreadLocal extends ThreadLocal{
 		在main线程中取得的值：1495849406233
		在main线程中取得的值：1495849406233
		在main线程中取得的值：1495849406233
		在main线程中取得的值：1495849406233
		在main线程中取得的值：1495849406233
		在main线程中取得的值：1495849406233
		在main线程中取得的值：1495849406233
		在main线程中取得的值：1495849406233
		在main线程中取得的值：1495849406233
		在main线程中取得的值：1495849406233
		在ThreadA中取得的值：1495849412239
		在ThreadA中取得的值：1495849412239
		在ThreadA中取得的值：1495849412239
		在ThreadA中取得的值：1495849412239
		在ThreadA中取得的值：1495849412239
		在ThreadA中取得的值：1495849412239
		在ThreadA中取得的值：1495849412239
		在ThreadA中取得的值：1495849412239
		在ThreadA中取得的值：1495849412239
		在ThreadA中取得的值：1495849412239
 * @author 朱红旭
 * @date 2017年5月27日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class InThreadLocal extends InheritableThreadLocal{
	@Override
	protected Object initialValue() {
		// TODO Auto-generated method stub
		return new Date().getTime();
	}
}


