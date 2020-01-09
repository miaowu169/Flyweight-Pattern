package com.practice.Client;

import com.practice.Flyweight.Soldier;
import com.practice.Flyweight.SoldierFactory;

public class Client {
	public static void main(String [] args) throws Exception {
		SoldierFactory factory = new SoldierFactory();
		
		Soldier fx = factory.getSoldierCategory("��ʦ");
		fx.typeDescription();
		
		Soldier fy = factory.getSoldierCategory("������");
		fy.typeDescription();
		
		Soldier fz = factory.getSoldierCategory("������");
		fz.typeDescription();
		
		Soldier fa = factory.getSoldierCategory("������");
		fa.typeDescription();
		
		Soldier fb = factory.getSoldierCategory("��ʦ");
		fb.typeDescription();
		
		Soldier fc = factory.getSoldierCategory("��ʦ");
		fc.typeDescription();
		
		System.out.println("С������������" + factory.getSoldierType());
		System.out.println("С������Ϊ��" + factory.getSoldierCount());	
	}
}
