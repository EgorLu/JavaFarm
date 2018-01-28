package animals;

import main.Animal;

public abstract class Bird extends Animal {
	
	private int wings;

	/* Constructors */
	
	public Bird(String name, int legs) {
		super(name, legs);
		this.wings = 2;
	}

}
