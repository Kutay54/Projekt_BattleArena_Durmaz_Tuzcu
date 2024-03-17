package battleArena;
 
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
 
public class battleArena {
	Scanner sc = new Scanner(System.in);
	private Character character1;
	private Character character2;
	private Character winner;
	private ArrayList <Character>list;
	public battleArena(Character c1, Character c2) {
		this.character1 = c1;
		this.character2 = c2;
		this.winner = null;
		this.list = new ArrayList<Character>(); 
	}
 
	public Character getC1() {
		return character1;
	}
	public void setC1(Character c1) {
		this.character1 = c1;
	}
	public Character getC2() {
		return character2;
	}
	public void setC2(Character c2) {
		this.character2 = c2;
	}
	public Character getWinner() {
		return winner;
	}
	public void setWinner(Character winner) {
		this.winner = winner;
	}	
	public ArrayList<Character> getList() {
		return list;
	}
	public void setList(ArrayList<Character> list) {
		this.list = list;
	}
	public void addCharacter (Character c ) {
		if (!this.list.contains(c)) {
			this.list.add(c);
		}
		else {
			System.err.println("Character bereits vorhanden");
		}
	}
 
	public void removeCharacter (Character c ) {
		this.list.remove(c);
	}
	/**
	 * Simulates game
	 */
	public boolean playGame(Character attacker, Character victim) {
		boolean entry = false;
		System.out.println(attacker.getName() + ", Gib eine Nnummer ein: (1 : angreifen, 2 : Spezialfähigkeit aktivieren, 3 : Spezialfähigkeit deaktivieren");
		int entry2 = sc.nextInt();
		switch(entry2) {
			case 1 :
				attacker.attack(victim);
				entry = true;
				break;
			case 2:
				attacker.isSpecialAbilityActive();
				entry = true;
				break;
			case 3:
				attacker.isSpecialAbilityDeactive();
				entry = true;
				break;
			default:
				System.out.println("Falsche Eingabe: Erneut wählen");
				entry = false;
		}
		return entry;
	}
	/**
	 * Initialises a fight
	 */
	public void fight() {
		System.out.println("Spieler 1 wähle Charakterart! 1 = Dragon, 2 = Dwarf");
		int dtc1 = sc.nextInt();
		System.out.println("Spieler 1 wähle Charakternamen");
		String c11 = sc.next();
		System.out.println("Spieler 1 wähle Charakterart! 1 = Dragon, 2 = Dwarf");
		int dtc2 = sc.nextInt();
		System.out.println("Spieler 2 wähle Charakternamen");
		String c22 = sc.next();
		switch(dtc1) {
			case 1:
				Character d1 = new Dragon(c11);
				this.setC1(d1);
				break;
			case 2:
				Character g1 = new Dwarf(c11);
				this.setC1(g1);
				break;
		}
		switch(dtc2) {
			case 1:
				Character d2 = new Dragon(c22);
				this.setC2(d2);
				break;
			case 2:
				Character g2 = new Dwarf(c22);
				this.setC2(g2);
				break;
		}
		int start = ThreadLocalRandom.current().nextInt(0, 2);
		Character attacker = start == 0 ? character1 : character2;
		Character victim = start == 1 ? character1 : character2;
		while (character1.getLifePoints() > 0 && character2.getLifePoints() >0) {
			boolean input = playGame(attacker, victim);
			if (input == true) {
				attacker = attacker == character1 ? character2 : character1;
				victim = victim == character2 ? character1 : character2;
				printStatistics();
			}
		}
		this.setWinner(victim.getLifePoints() == 0 ? attacker : victim);
		System.out.println("Gewonnen hat: " + this.getWinner().getName());
	}
 
	
	private void printStatistics() {
		System.out.println("Stats von " + this.character1.getName() + " :");
		System.out.println("\tHerzen: " + this.character1.getLifePoints());
		System.out.println("\t jetzige Angriffsstärke: " + this.character1.getAttackStrength());
		System.out.println("");
		System.out.println("Stats von " + this.character2.getName() + " :");
		System.out.println("\tHerzen: " + this.character2.getLifePoints());
		System.out.println("\t jetzigeAngriffsstärke: " + this.character2.getAttackStrength());
	}
	}
 