package com.classmodule.flyweight;
/*
 * �ǹ��������Ԫ��
 */
public class UnsharedConcreteFlyweight extends Flyweight{
	public UnsharedConcreteFlyweight(String extrinsic) {
		super(extrinsic);
	}

	@Override
	public void operate(int extrinsic) {
		System.out.println("�ǹ���ľ���Flyweight:" + extrinsic);
	}
}
