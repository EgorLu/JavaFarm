package animals;

import main.Animal;

public class Snake extends Animal{

	public Snake(String name) {
		super(name, 0);
	}

	@Override
	public void makeNoise() {
		System.out.println("Tsss...");
		
	}

	@Override
	public void eat() {
		System.out.println("Snake eats");
	}
	
}
