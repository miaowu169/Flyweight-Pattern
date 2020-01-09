package com.classmodule.flyweight;

import java.util.HashMap;
/*
 * ������Ԫ������
 */
public class FlyweightFactory {
	//����һ��������
	private static HashMap<String,Flyweight> pool = new HashMap<>();
	
	//��Ԫ����
	public static Flyweight getFlyweight(String extrinsic) {
		Flyweight flyweight = null;
		
		if(pool.containsKey(extrinsic)) {//�����иö���
			flyweight = pool.get(extrinsic);
			System.out.print("���� " + extrinsic + "ֱ�Ӵӳ���ȡ��--->");
		}else {
			//�����ⲿ״̬������Ԫ����
			flyweight = new ConcreteFlyweight(extrinsic);
			//�������
			pool.put(extrinsic, flyweight);
			System.out.print("����" + extrinsic + "���ӳ���ȡ��---->");
		}
		return flyweight;
	}
}
