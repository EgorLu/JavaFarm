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
		this.name = new String(name);
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
		livestock = newArray; // Aliasing might be a problem;
		livestock[livestock.length - 1].setEnclosure(this); // Set the animal's enclosure to this one.
	}

	public void removeAnimal(Animal animal) {
		Animal[] newArray = new Animal[livestock.length - 1];
		boolean shift = false;
		for (int i = 0; i < livestock.length; i++) {
			if (livestock[i] == animal) { // Address check
				shift = true;
			}
			if (shift) {
				if (i < livestock.length - 1) {
					newArray[i] = livestock[i + 1];
				}
			} else {
				newArray[i] = livestock[i];
			}
		}
		livestock = newArray; // Aliasing might be a problem;

	}

	public void listAnimals() {
		System.out.println(name + " has " + livestock.length + " next animals: ");
		for (int i = 0; i < livestock.length; i++) {
			System.out.println((i + 1) + ". " + livestock[i]);
		}
	}

	/* Getter & Setters */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = new String(name);
	}

	public Animal getAnimal(int i) {
		return livestock[i];
	}

	public Human getHuman(int i) {
		return people[i];
	}

	public String toString() {
		return "Enclosure \"" + name + "\".";
	}

	public boolean isEmpty() {
		return livestock.length == 0;
	}
}
