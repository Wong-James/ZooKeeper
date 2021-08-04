package com.james.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		setEnergy(getEnergy() + 200);
	}
	
	public void fly() {
		setEnergy(getEnergy() - 50);
		System.out.println("The bat flies away! Energy is now: " + getEnergy());
	}
	
	
	public void eatHumans() {
		setEnergy(getEnergy() + 25);
		System.out.println("Tasty soul! Energy is now: " + getEnergy());
	}
	
	public void attackTown() {
		setEnergy(getEnergy() - 100);
		System.out.println("Town destroyed! Energy is now: " + getEnergy());
	}

}
