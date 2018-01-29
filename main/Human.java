package main;

public class Human extends Creature {

	/* Constructors */
	
	public Human(String name) {
		super(name, 2);
	}

	@Override
	public <food> void eat(food f) {
		System.out.println(this + " eats " + f);		
	}

}
