package com.classmodule.flyweight;
/*
 * 非共享具体享元类
 */
public class UnsharedConcreteFlyweight extends Flyweight{
	public UnsharedConcreteFlyweight(String extrinsic) {
		super(extrinsic);
	}

	@Override
	public void operate(int extrinsic) {
		System.out.println("非共享的具体Flyweight:" + extrinsic);
	}
}
