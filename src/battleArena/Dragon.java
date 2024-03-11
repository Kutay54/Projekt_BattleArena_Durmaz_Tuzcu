package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Character{
	
	
	public Dragon(String name) {
		super(name);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(20, 25+1));
		this.setSpecialAbilityDevice(false);
	}

	
	public void getDamage(int points) {
		if(this.getLifePoints() - points < 0) {
			this.setLifePoints(0);
		}
		else this.setLifePoints(this.getLifePoints() - points);
		
	}

	
	public void attack(Character enemy) {
		enemy.getDamage(this.getAttackStrength());
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(20, 25+1));
		if(this.isSpecialAbilityDevice()) {
			this.setAttackStrength(getAttackStrength() - ThreadLocalRandom.current().nextInt(5 , 10 + 1));
		}
	}

	public void isSpecialAbilityActive() {
		if(this.isSpecialAbilityDevice() == false) {
			this.setSpecialAbilityDevice(true);
			this.setAttackStrength(this.getAttackStrength() - ThreadLocalRandom.current().nextInt(5,10 + 1));
			this.setLifePoints(getLifePoints() + 10);
		}
		else
			System.out.println("Spezialfähigkeit ist bereits aktiv!");
	}

	public void isSpecialAbilityDeactive() {
		this.setSpecialAbilityDevice(false);
		this.setAttackStrength(getAttackStrength() - ThreadLocalRandom.current().nextInt(20, 25 + 1));
		this.setLifePoints(10);
	}
	
	public String toString() {
		return "Dragon: " + this.getName() + "/n" + "Lifepoints: " + this.getLifePoints()
		+ "/n" + "Attackingstrength: " + this.getAttackStrength() + "/n" 
				+  "Specialability: " + this.isSpecialAbilityDevice();
	}
	
}
