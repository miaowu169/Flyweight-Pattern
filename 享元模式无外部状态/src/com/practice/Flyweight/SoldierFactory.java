package com.practice.Flyweight;

import java.util.ArrayList;
/*
 * ������������(SoldierFactory��)
 */
public class SoldierFactory {
	private ArrayList<Soldier> soldier = new ArrayList<>();
	private int totalSoldier = 0;
	public SoldierFactory() {
		Soldier s1 = new LongRangeSoldier("��ʦ(ʹ��ħ�����������ˣ�����ħ������)");
		soldier.add(s1);
		Soldier s2 = new ShortRangeSoldier("������(ʹ�û��׹������ˣ�����������)");
		soldier.add(s2);
	}
	
	//���С��������
	public Soldier getSoldierCategory(String type) throws Exception {
		if(type.equals("��ʦ")) {
			totalSoldier ++;
			return (Soldier)soldier.get(0);
		}else if(type.equals("������")) {
			totalSoldier ++;
			return (Soldier)soldier.get(1);
		}else {
			throw new Exception();
		}
	}
	
	//���С������
	public int getSoldierCount() {
		return totalSoldier;
	}
	//���С����������
	public int getSoldierType() {
		return soldier.size();
	}
}
