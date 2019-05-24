package com.hassan.cheaper03.demo03.initfirsttime;
/**
 * @author 朱红旭
 * @date 2017年5月25日
 * @company 上海奇硕网络科技有限公司
 * @version 1.0
 */
public class Text extends ThreadLocal{
	@Override
	protected Object initialValue() {
		return "我是默认值 第一次get不再为null";
	}
}


