package main;

import java.util.Scanner;

import animals.*;

public class Menu {

	private Farm farm;
	private int choice;
	private Scanner scan;

	public Menu(Farm farm, Scanner scan) {
		this.farm = farm;
		this.scan = scan;
	}

	public void mainMenu() {
		choice = 0;

		do {
			System.out.println("---Main menu");
			System.out.println("Please choose an action:");
			System.out.println("1. Farm manipulation.");
			System.out.println("2. Enclosure manipulation.");
			System.out.println("3. Human manipulation.");

			choice = scan.nextInt();
		} while (choice < 1 || choice > 3);

		switch (choice) {
		case 1:
			farmMenu();
			break;
		case 2:
			enclosureMenu();
			break;
		case 3:
			humanMenu();
			break;
		}
	}

	private void farmMenu() {
		choice = 0;

		do {
			System.out.println("---Farm manipulation menu \"" + farm.getName() + "\"");
			System.out.println("Please choose an action:");
			System.out.println("1. Rename farm.");
			System.out.println("0. Back to main menu.");

			choice = scan.nextInt();
		} while (choice < 0 || choice > 1);

		switch (choice) {
		case 1:
			farm.rename(); // Rename.
			break;
		case 0:
			mainMenu();
			break;
		}
		farmMenu(); // Then back to the menu (don't terminate).
	}

	private void enclosureMenu() {
		choice = 0;

		do {
			System.out.println("---Enclosure manipulation menu");
			System.out.println("Please choose an action:");
			System.out.println("1. List enclosures.");
			System.out.println("2. Edit enclosure.");
			System.out.println("3. Add enclosure.");
			System.out.println("0. Back to main menu.");

			choice = scan.nextInt();
		} while (choice < 0 || choice > 3);

		switch (choice) {
		case 1:
			farm.listEnclosures(); // List all enclosures in the farm.
			break;
		case 2:
			Enclosure enc = farm.getEnclosure();
			if (enc != null)
				enclosureEditMenu(enc);
			break;
		case 3:
			farm.addEnclosure();
			break;
		case 0:
			mainMenu();
			break;
		}
		enclosureMenu(); // Then back to the menu (don't terminate).
	}

	private void enclosureEditMenu(Enclosure enc) {
		choice = 0;

		do {
			System.out.println("---Enclosure edit menu");
			System.out.println("Please choose an action:");
			System.out.println("1. Remove enclosure.");
			System.out.println("2. Rename enclosure.");
			System.out.println("3. List animals.");
			System.out.println("4. Edit animal.");
			System.out.println("5. Add animal.");
			System.out.println("0. Back to main menu.");

			choice = scan.nextInt();
		} while (choice < 0 || choice > 5);

		switch (choice) {
		case 1:
			// TODO
			break;
		case 2:
			// TODO
			break;
		case 3:
			enc.listAnimals();
			break;
		case 4:
			animalEditMenu();
			break;
		case 5:
			animalAddMenu(enc);
			break;
		case 0:
			mainMenu();
			break;
		}
		enclosureEditMenu(enc);
	}

	private void animalAddMenu(Enclosure enc) {
		choice = 0;

		do {
			System.out.println("---Animal add menu");
			System.out.println("Please choose an action:");
			System.out.println("1. List animal types.");
			System.out.println("2. Create an animal.");
			System.out.println("0. Back to main menu.");

			choice = scan.nextInt();
		} while (choice < 0 || choice > 2);

		switch (choice) {
		case 1:
			listAnimalTypes(enc);
			break;
		case 2:
			enc.addAnimal(createAnimal());
			break;
		case 0:
			mainMenu();
			break;
		}
		animalAddMenu(enc);
	}

	private void listAnimalTypes(Enclosure enc) {
		System.out.println("---Possible animal types:");
		System.out.println("--Mammals:"); // Mammals
		System.out.println("Cow");
		System.out.println("Horse");
		System.out.println("Pig");
		System.out.println("Sheep");
		System.out.println("Goat");
		System.out.println("--Birds:"); // Birds
		System.out.println("Chicken");
		System.out.println("Hawk");
		System.out.println("--Reptiles:"); // Reptiles
		System.out.println("Snake");
		animalAddMenu(enc);
	}

	private Animal createAnimal() {
		System.out.println("Animal type:");
		String type = scan.next();
		System.out.println("Animal name:");
		String name = scan.next();
		Animal newAnimal = null;

		type = type.toLowerCase(); // Transform to lower-case to ease the checks.
		switch (type) {
		case "cow":
			break;
		case "horse":
			break;
		case "pig":
			break;
		case "sheep":
			break;
		case "goat":
			break;
		case "chicken":
			break;
		case "hawk":
			break;
		case "snake":
			newAnimal = new Snake(name);
			break;
		}
		return newAnimal;
	}

	private void animalEditMenu() {
		choice = 0;

		do {
			System.out.println("---Animal edit menu");
			System.out.println("Please choose an action:");
			System.out.println("1. Remove animal.");
			System.out.println("2. Rename animal.");
			// Additional options like "change amount of legs, etc".
			System.out.println("0. Back to main menu.");

			choice = scan.nextInt();
		} while (choice < 0 || choice > 2);

		switch (choice) {
		case 1:
			// TODO
			break;
		case 2:
			// TODO
			break;
		case 0:
			mainMenu();
			break;
		}
	}

	private void humanMenu() {
		choice = 0;

		do {
			System.out.println("---Human manipulation menu");
			System.out.println("Please choose an action:");
			System.out.println("1. List humans.");
			System.out.println("2. Edit human.");
			System.out.println("3. Add human.");
			System.out.println("0. Back to main menu.");

			choice = scan.nextInt();
		} while (choice < 0 || choice > 3);

		switch (choice) {
		case 1:
			// TODO
			break;
		case 2:
			// TODO
			break;
		case 3:
			// TODO
			break;
		case 0:
			mainMenu();
			break;
		}
	}
}
