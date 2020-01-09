package com.practice.Client;

import com.practice.Flyweight.Camp;
import com.practice.Flyweight.Soldier;
import com.practice.Flyweight.SoldierFactory;

public class Client {
	public static void main(String [] args) throws Exception {
		SoldierFactory factory = new SoldierFactory();
		
		Soldier fx = factory.getSoldierCategory("法师");
		fx.funcDescription(new Camp("红方阵营"));
		
		Soldier fy = factory.getSoldierCategory("超级兵");
		fy.funcDescription(new Camp("红方阵营"));
		
		Soldier fz = factory.getSoldierCategory("超级兵");
		fz.funcDescription(new Camp("蓝方阵营"));
		
		Soldier fa = factory.getSoldierCategory("超级兵");
		fa.funcDescription(new Camp("红方阵营"));
		
		Soldier fb = factory.getSoldierCategory("法师");
		fb.funcDescription(new Camp("蓝方阵营"));
		
		Soldier fc = factory.getSoldierCategory("法师");
		fc.funcDescription(new Camp("蓝方阵营"));
		
		System.out.println("小兵分类总数：" + factory.getSoldierType());
		System.out.println("小兵总数为：" + factory.getSoldierCount());	
	}
}
