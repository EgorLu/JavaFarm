package animals;

import main.Animal;
import main.Creature;

public class Snake extends Reptile {

	public Snake(String name) {
		super(name, 0);
	}

	@Override
	public void makeNoise() {
		System.out.println("Tsss...");

	}

	@Override
	public <food> void eat(food f) {
		if (this.carnivoreCheck(f)) { // If "f" is an Creature.
			if (((Creature) f).getEnclosure().equals(this.getEnclosure())) { // If in the same enclosure...
				System.out.println(this + " eats " + f);
				this.getEnclosure().removeAnimal((Animal) f);
			} else {
				System.out.println(this + "and " + f + " are in different enclosures.");
			}
		} else {
			System.out.println("Snakes eat other animals.");
		}
	}

}
