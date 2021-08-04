package com.james.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		}
	
	public void throwSomething() {
		setEnergy(getEnergy() -5 );
		System.out.println("A rock has been thrown. Energy level is now: " + getEnergy());
	}
	
	public void eatBananas() {
		setEnergy(getEnergy() +10 );
		System.out.println("Mmm Banana! Energy level is now: " + getEnergy());
	}
	
	public void climb() {
		setEnergy(getEnergy() -10);
		System.out.println("Tree was easy to climb. Energy level is now: " + getEnergy());
	}
}
