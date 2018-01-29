package main;

import animals.*;

/*
 * Livestock can include food animals such as cattle, sheep and pigs,
 * animals used for pleasure such as riding horses or exotic animals such as bison.
 * Some, such as horses, need to be trained. Dairy farmers must milk their animals and handle the milk.
 * Animals often need routine vaccinations, worming or other care that the farmer manages or performs.
 */

public class Farm {

	public static void main(String[] args) {

		Enclosure enc1 = new Enclosure("Reptile House");
		Animal snake1 = new Snake("John");
		Animal snake2 = new Snake("Lola");
		Human human1 = new Human("Carlos");
		
		enc1.addAnimal(snake1);
		enc1.addAnimal(snake2);
		enc1.printAnimals();
		
		snake1.makeNoise();
		
		snake1.eat(snake2);
		enc1.printAnimals();
		human1.eat(snake1);
	}

}
