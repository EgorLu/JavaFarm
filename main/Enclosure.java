package main;

public class Enclosure {

	private String name;
	private Animal[] livestock;
	private Human[] people;

	/* Constructors */

	/**
	 * Empty constructor
	 */
	public Enclosure(String name) {
		this.name = name;
		this.livestock = new Animal[0];
		this.people = new Human[0];
	}

	/**
	 * Copy constructor
	 * 
	 * @param enc
	 */
	public Enclosure(Enclosure enc) {
		// TODO
	}

	/* Public methods */
	public void addAnimal(Animal animal) {
		Animal[] newArray = new Animal[livestock.length + 1];
		for (int i = 0; i < livestock.length; i++) {
			newArray[i] = livestock[i];
		}
		newArray[newArray.length - 1] = animal;
		livestock = newArray;
		// Aliasing might be a problem;
	}

	public void printAnimals() {
		System.out.println(name + " has " + livestock.length + " next animals: ");
		for (int i = 0; i < livestock.length; i++) {
			System.out.println((i + 1) + ". " + livestock[i]);
		}
	}
}
