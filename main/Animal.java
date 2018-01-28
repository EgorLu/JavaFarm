package main;

public abstract class Animal extends Creature {

	/* Constructors */
	
	public Animal(String name, int legs) {
		super(name, legs);
	}
	
	public Animal(Animal copyAnimal) {
		super(copyAnimal.getName(), copyAnimal.getLegs());
	}

	/* Public methods */
	
	public abstract void makeNoise();
	
	public abstract void eat();
}
