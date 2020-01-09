package com.practice.Client;

import com.practice.Flyweight.Soldier;
import com.practice.Flyweight.SoldierFactory;

public class Client {
	public static void main(String [] args) throws Exception {
		SoldierFactory factory = new SoldierFactory();
		
		Soldier fx = factory.getSoldierCategory("法师");
		fx.typeDescription();
		
		Soldier fy = factory.getSoldierCategory("超级兵");
		fy.typeDescription();
		
		Soldier fz = factory.getSoldierCategory("超级兵");
		fz.typeDescription();
		
		Soldier fa = factory.getSoldierCategory("超级兵");
		fa.typeDescription();
		
		Soldier fb = factory.getSoldierCategory("法师");
		fb.typeDescription();
		
		Soldier fc = factory.getSoldierCategory("法师");
		fc.typeDescription();
		
		System.out.println("小兵分类总数：" + factory.getSoldierType());
		System.out.println("小兵总数为：" + factory.getSoldierCount());	
	}
}
