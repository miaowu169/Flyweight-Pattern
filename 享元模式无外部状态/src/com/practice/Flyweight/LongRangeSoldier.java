package com.practice.Flyweight;
/*
 * ����������Ԫ��
 * @param type ������ڲ�״̬,��ͬLongRangeSoldier����typeֵһ����ͬ��
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
	public void typeDescription() {
		System.out.println("С�����ࣺԶ�̱�������Ϊ��" + type);
	}

}
