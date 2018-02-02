package main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Farm farm = new Farm("MyFarm", scan);
		Menu menu = new Menu(farm, scan);
		
		menu.mainMenu();
		
	}

}
