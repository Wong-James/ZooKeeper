package com.james.zookeeper;


public class MammalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal zebra = new Mammal();
		Gorilla cool = new Gorilla();
		Bat batman = new Bat();
		int zebraEnergy = zebra.getEnergy();
		int coolEnergy = cool.getEnergy();
		int batEnergy = batman.getEnergy();
		System.out.println(zebraEnergy);
		System.out.println(coolEnergy);
		System.out.println(batEnergy);
		cool.throwSomething();
		cool.throwSomething();
		cool.throwSomething();
		cool.eatBananas();
		cool.eatBananas();
		cool.climb();
		batman.attackTown();
		batman.attackTown();
		batman.attackTown();
		batman.eatHumans();
		batman.eatHumans();
		batman.fly();
		batman.fly();
	}

}
