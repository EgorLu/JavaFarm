package main;

public abstract class Creature {

	private String name;
	private String type;
	private int health;
	private int legs;
	private int age;

	/* Constructors */

	/**
	 * Basic constructor
	 * 
	 * @param name
	 *            Name of the creature
	 * @param legs
	 *            Number of legs
	 */
	public Creature(String name, int legs) {
		this.name = name;
		this.legs = legs;
		this.health = 100;
		this.age = 0;
		this.type = this.getClass().getSimpleName();
	}

	/**
	 * Basic constructor with age parameter
	 * 
	 * @param name
	 *            Name of the creature
	 * @param legs
	 *            Number of legs
	 * @param age
	 *            Age of the creature
	 */
	public Creature(String name, int legs, int age) {
		this.name = name;
		this.legs = legs;
		this.health = 100;
		this.age = age;
		this.type = this.getClass().getSimpleName();
	}

	/* Public methods */

	public String getName() {
		return name;
	}

	public String toString() {

		return type + " named " + name;
	}

	public abstract <food> void eat(food f);
	
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

	
	public String getType() {
		return type;
	}
	

	public void setType(String type) {
		this.type = type;
	}
	

	public int getAge() {
		return age;
	}
	

	public void setAge(int age) {
		this.age = age;
	}

}
