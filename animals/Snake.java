package animals;

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
		if (f.getClass().getSuperclass().getSuperclass().getSimpleName().equals("Animal")) {
			System.out.println(this + " eats " + f);
		} else {
			System.out.println("Snakes eat other animals.");
		}
	}

}
