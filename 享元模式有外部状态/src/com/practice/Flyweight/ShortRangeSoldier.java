package com.practice.Flyweight;
/*
 * ����������Ԫ��
 * @param belongCamp�����ⲿ״̬
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
	public void funcDescription(Camp belongCamp) {
		System.out.println("С�����ࣺ��ս��������Ϊ��" + type + ":" + belongCamp.getCamp());
	}
}
