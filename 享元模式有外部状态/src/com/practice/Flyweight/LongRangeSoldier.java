package com.practice.Flyweight;
/*
 * ����������Ԫ��
 * @belongCamp�����ⲿ״̬
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
		System.out.println("С�����ࣺԶ�̱�������Ϊ��" + type + ":" + belongCamp.getCamp());		
	}
	

}
