package com.classmodule.flyweight;
/*
 * 创建抽象享元类
 */
public abstract class Flyweight {
	//内部状态
	public String intrinsic;
	//外部状态
	public String extrinsic;
	
	//要求享元角色必须接受外部状态
	public Flyweight(String extrinsic) {
		this.extrinsic = extrinsic;
	}
	
	//定义业务操作
	public abstract void operate(int extrinsic);
	
	public String getInstrinsic() {
		return intrinsic;
	}
	
	public void setIntrinsic(String _intrinsic) {
		this.intrinsic = _intrinsic;
	}
}
