package com.practice.Flyweight;
/*
 * 创建具体享元类
 * @param type 共享的内部状态,相同ShortRangeSoldier对象，type值一定相同。
 */
public class ShortRangeSoldier implements Soldier {
	private String type;
	
	public ShortRangeSoldier(String _type) {
		this.type = _type;
	}
	
	public String getType() {
		return this.type;
	}
	
	@Override
	public void typeDescription() {
		System.out.println("小兵分类：近战兵，类型为：" + type);
	}
}
