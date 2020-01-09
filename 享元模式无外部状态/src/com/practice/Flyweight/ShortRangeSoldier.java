package com.practice.Flyweight;
/*
 * ����������Ԫ��
 * @param type ������ڲ�״̬,��ͬShortRangeSoldier����typeֵһ����ͬ��
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
		System.out.println("С�����ࣺ��ս��������Ϊ��" + type);
	}
}
