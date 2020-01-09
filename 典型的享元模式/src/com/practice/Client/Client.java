package com.practice.Client;

import com.classmodule.flyweight.Flyweight;
import com.classmodule.flyweight.FlyweightFactory;

public class Client {
	public static void main(String[] args) {
		int extrinsic = 22;
		
		Flyweight flyweightX = FlyweightFactory.getFlyweight("X");
		flyweightX.operate(++extrinsic);
	
		Flyweight flyweightY = FlyweightFactory.getFlyweight("Y");
		flyweightY.operate(++extrinsic);
		
		Flyweight flyweightZ = FlyweightFactory.getFlyweight("Z");
		flyweightZ.operate(++extrinsic);
		
		Flyweight flyweightReX = FlyweightFactory.getFlyweight("X");
		flyweightReX.operate(++extrinsic);
	}
}
