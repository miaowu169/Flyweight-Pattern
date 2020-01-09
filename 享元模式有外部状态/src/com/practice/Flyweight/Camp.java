package com.practice.Flyweight;
/*
 *创建外部状态(Camp),用于标识小兵所属阵营
*/
public class Camp {
	private String belongCamp;
	
	public Camp(String _belongCamp) {
		this.belongCamp = _belongCamp;
	}
	
	public String getCamp() {
		return belongCamp;
	}
}
