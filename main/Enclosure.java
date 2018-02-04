package main;

import java.util.Scanner;

import utils.Stack;

public class Enclosure {

	private String name;
	private Stack<Animal> livestock;
	private Stack<Human> people;
	private Scanner scan;

	/* Constructors */

	/**
	 * Empty constructor
	 */
	public Enclosure(String name, Scanner scan) {
		this.name = new String(name);
		this.livestock = new Stack<Animal>();
		this.people = new Stack<Human>();
		this.scan = scan;
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
		if (animal != null) {
			animal.setEnclosure(this); // Set the animal's enclosure to this one.
			livestock.push(animal);
		}
	}

	public void removeAnimal(Animal animal) {
		livestock.removeItem(animal);
	}

	public void listAnimals() {
		if (livestock.isEmpty()) {
			System.out.println("The enclosure is empty.");
		} else {
			System.out.println(name + " has " + livestock.size() + " next animals: ");
			System.out.print(livestock);
		}
	}

	public Animal selectAnimal() {
		if (livestock.isEmpty()) {
			System.out.println("There are no animals to edit.");
		} else {
			System.out.println("Enter the id of the animal:");
			int choice = scan.nextInt() - 1;
			return livestock.getItemAt(choice);
		}
		return null;
	}
	
	/* Getter & Setters */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = new String(name);
	}

	public Animal getAnimal(int i) {
		return livestock.getItemAt(i);
	}

	public Human getHuman(int i) {
		return people.getItemAt(i);
	}

	public String toString() {
		return "Enclosure \"" + name + "\".";
	}

	public boolean isEmpty() {
		return livestock.isEmpty();
	}

	public void rename() {
		System.out.println("New enclosure name: ");
		setName(scan.next());
		System.out.println("Farm renamed to: " + getName());
	}
}
