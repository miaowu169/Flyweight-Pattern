package com.practice.Flyweight;
/*
 * 创建具体享元类
 * @param belongCamp接受外部状态
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
	public void funcDescription(Camp belongCamp) {
		System.out.println("小兵分类：近战兵，类型为：" + type + ":" + belongCamp.getCamp());
	}
}
