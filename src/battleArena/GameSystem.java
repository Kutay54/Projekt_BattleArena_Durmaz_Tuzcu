package battleArena;

import java.util.Scanner;

public class GameSystem {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int ChoiceOfCharacter = 0;
		
		Character c1 = null;
		Character c2 = null;
		
		
		/*
		 * Choosing characters
		 */
		for (int i = 1; i < 3; i++) {
			System.out.println("Player " + i + "Choose a character");
		System.out.println("1 -- Dwarf");
		System.out.println("2 -- Dragon");
		boolean fn = true;
		
		
		/**
		 * To make sure the selection for the character is valid
		 */
		do {
			ChoiceOfCharacter = sc.nextInt();
			if(ChoiceOfCharacter == 1 || ChoiceOfCharacter == 2) {
				fn = false;
			}
		}while (fn);
			System.out.println("Player " + i + "Please enter a name");
		
		/**
		 * TO make sure there is no empty name
		 */
		do {
			name = sc.next();
			}
			while(name.equals(""));
		}
		
		/**
		 * Checking if the first character has been initialized
		 * If thats the case the second player can now choose a character
		 */
		if(c1 != null) {
			ChoiceOfCharacter += 20;
		}
		
		/**
		 * Depending on the selection, it creates an instances of character subclasses
		 */
		switch(ChoiceOfCharacter) {
		case 1: c1 = new Dragon(name);
		break;
		
		case 2: c1 = new Dwarf(name);
		break;
		
		case 21: c2 = new Dragon(name);
		break;
		
		case 22: c2 = new Dwarf(name);
		break;
		}
	
	}
}
