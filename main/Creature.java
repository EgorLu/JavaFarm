package main;

public abstract class Creature {

	private String name;
	private String type;
	private int health;
	private int legs;

	/* Constructors */

	public Creature(String name, int legs) {
		this.name = name;
		this.legs = legs;
		this.health = 100;
		this.type = this.getClass().getSimpleName();
	}

	/* Public methods */

	public String getName() {
		return name;
	}

	public String toString() {
		
		return type + " named " + name + ".";
	}
	
	/* Getter & Setters */

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

}
