package main;

import java.util.Scanner;

import utils.Stack;

/*
 * Livestock can include food animals such as cattle, sheep and pigs,
 * animals used for pleasure such as riding horses or exotic animals such as bison.
 * Some, such as horses, need to be trained. Dairy farmers must milk their animals and handle the milk.
 * Animals often need routine vaccinations, worming or other care that the farmer manages or performs.
 */

public class Farm {

	private String name;
	private Stack<Enclosure> enclosures;
	private Stack<Human> people;
	private Scanner scan;

	public Farm(String name, Scanner scan) {
		this.name = new String(name);
		this.enclosures = new Stack<Enclosure>();
		this.people = new Stack<Human>();
		this.scan = scan;
	}

	public void rename() {
		System.out.println("New farm name: ");
		setName(scan.next());
		System.out.println("Farm renamed to: " + getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = new String(name);
	}

	public void addHuman() {
		System.out.println("Enter the human's name:");
		String name = scan.next();
		people.push(new Human(name));
	}

	public void removeHuman(Human hum) {
		people.removeItem(hum);
	}

	public Human selectHuman() {
		if (people.isEmpty()) {
			System.out.println("There are no people to edit.");
		} else {
			System.out.println("Enter the id of the human:");
			int choice = scan.nextInt() - 1;
			return people.getItemAt(choice);
		}
		return null;
	}

	public void addEnclosure() {
		System.out.println("Enter the enclosure's name:");
		String name = scan.next();
		enclosures.push(new Enclosure(name, scan));
	}

	public void listEnclosures() {
		if (enclosures.isEmpty()) {
			System.out.println("The farm is empty.");
		} else {
			System.out.println("\"" + getName() + "\"'s enclosures:");
			System.out.print(enclosures);
		}
	}

	public void listPeople() {
		if (people.isEmpty()) {
			System.out.println("No people in the farm.");
		} else {
			System.out.println("\"" + getName() + "\"'s people:");
			System.out.print(people);
		}
	}

	public Enclosure getEnclosure() {
		if (enclosures.isEmpty()) {
			System.out.println("There are no enclosures to edit.");
		} else {
			System.out.println("Enter the id of the enclosure:");
			int choice = scan.nextInt() - 1;
			return enclosures.getItemAt(choice);
		}
		return null;
	}

	public void removeEnclosure(Enclosure enc) {
		enclosures.removeItem(enc);
	}

	/* Farm Drawing */

	public void drawFarm() {
		System.out.println("\t" + name);
		int i = 0;
		// Top
		drawFullLine(i);
		// Mid
		drawEmptyLine();
		if (!enclosures.isEmpty()) {
			drawEnclosureTop();
			drawEnclosureMid();
			drawEnclosureBot();
		}
		drawEmptyLine();
		// Bot
		drawFullLine(i);
	}

	private void drawEmptyLine() {
		System.out.print("\t|  ");
		for (int j = 0; j < enclosures.size(); j++) {
			System.out.print("      ");
		}
		System.out.println("  |");
	}

	private void drawEnclosureTop() {
		System.out.print("\t|  ");
		for (int j = 0; j < enclosures.size(); j++) {
			System.out.print(" |--| ");
		}
		System.out.println("  |");
	}

	private void drawEnclosureMid() {
		System.out.print("\t|  ");
		for (int j = 0; j < enclosures.size(); j++) {
			System.out.print(" |" + (enclosures.getItemAt(j).isEmpty() ? "  " : "**") + "| ");
		}
		System.out.println("  |");
	}

	private void drawEnclosureBot() {
		System.out.print("\t|  ");
		for (int j = 0; j < enclosures.size(); j++) {
			System.out.print(" |--| ");
		}
		System.out.println("  |");
	}

	private void drawFullLine(int i) {
		System.out.print("\t|--");
		for (i = 0; i < enclosures.size(); i++) {
			System.out.print("------");
		}
		System.out.println("--|");
	}
}
