package com.practice.Client;

import com.practice.Flyweight.Camp;
import com.practice.Flyweight.Soldier;
import com.practice.Flyweight.SoldierFactory;

public class Client {
	public static void main(String [] args) throws Exception {
		SoldierFactory factory = new SoldierFactory();
		
		Soldier fx = factory.getSoldierCategory("��ʦ");
		fx.funcDescription(new Camp("�췽��Ӫ"));
		
		Soldier fy = factory.getSoldierCategory("������");
		fy.funcDescription(new Camp("�췽��Ӫ"));
		
		Soldier fz = factory.getSoldierCategory("������");
		fz.funcDescription(new Camp("������Ӫ"));
		
		Soldier fa = factory.getSoldierCategory("������");
		fa.funcDescription(new Camp("�췽��Ӫ"));
		
		Soldier fb = factory.getSoldierCategory("��ʦ");
		fb.funcDescription(new Camp("������Ӫ"));
		
		Soldier fc = factory.getSoldierCategory("��ʦ");
		fc.funcDescription(new Camp("������Ӫ"));
		
		System.out.println("С������������" + factory.getSoldierType());
		System.out.println("С������Ϊ��" + factory.getSoldierCount());	
	}
}
