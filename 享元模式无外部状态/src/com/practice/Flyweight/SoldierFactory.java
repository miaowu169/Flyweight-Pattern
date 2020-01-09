package com.practice.Flyweight;

import java.util.ArrayList;
/*
 * 创建共享工厂类(SoldierFactory类)
 */
public class SoldierFactory {
	private ArrayList<Soldier> soldier = new ArrayList<>();
	private int totalSoldier = 0;
	public SoldierFactory() {
		Soldier s1 = new LongRangeSoldier("法师(使用魔法弹攻击敌人，属于魔法攻击)");
		soldier.add(s1);
		Soldier s2 = new ShortRangeSoldier("超级兵(使用机甲攻击敌人，属于物理攻击)");
		soldier.add(s2);
	}
	
	//获得小兵的类型
	public Soldier getSoldierCategory(String type) throws Exception {
		if(type.equals("法师")) {
			totalSoldier ++;
			return (Soldier)soldier.get(0);
		}else if(type.equals("超级兵")) {
			totalSoldier ++;
			return (Soldier)soldier.get(1);
		}else {
			throw new Exception();
		}
	}
	
	//获得小兵总数
	public int getSoldierCount() {
		return totalSoldier;
	}
	//获得小兵分类总数
	public int getSoldierType() {
		return soldier.size();
	}
}
