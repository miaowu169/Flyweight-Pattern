package com.classmodule.flyweight;
/*
 * ����ConcreteFlyweight��(������Ԫ��)
 */
public class ConcreteFlyweight extends Flyweight{
	//�����ⲿ״̬
	public ConcreteFlyweight(String extrinsic) {
		super(extrinsic);
	}
	
	//�����ⲿ״̬�����߼�����
	@Override
	public void operate(int extrinsic) {
		System.out.println("����Flyweight:" + extrinsic);
	}
}
