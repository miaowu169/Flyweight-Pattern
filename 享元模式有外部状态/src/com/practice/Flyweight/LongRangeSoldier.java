package com.practice.Flyweight;
/*
 * 创建具体享元类
 * @belongCamp接收外部状态
 */
public class LongRangeSoldier implements Soldier {
	private String type;
	
	public LongRangeSoldier(String _type) {
		this.type = _type;
	}
	
	public String getType() {
		return this.type;
	}

	@Override
	public void funcDescription(Camp belongCamp) {
		System.out.println("小兵分类：远程兵，类型为：" + type + ":" + belongCamp.getCamp());		
	}
	

}
