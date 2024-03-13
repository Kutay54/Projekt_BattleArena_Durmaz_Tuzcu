package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends Character{

	public Dwarf(String name) {
		super(name);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(15, 25 + 1));
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
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(15, 25+1));
		if(this.isSpecialAbilityDevice()) {
			this.setAttackStrength(getAttackStrength() - ThreadLocalRandom.current().nextInt(5 , 10 + 1));
		}
	}
	
	public boolean isSpecialAbility() {
		int ran = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		if(this.getLifePoints()<= 50 && this.getLifePoints() > 20) {
			if(ran > 0 && ran <3) {
				return true;
			}
		}
		else if(this.getLifePoints() <= 20 && this.getLifePoints() > 10) {
				if(ran > 0 && ran < 5) {
					return true;
				}
		}
		else if(this.getLifePoints() <= 10) {
			if(ran > 0 && ran < 7) {
				return true;
			}
		}
		return false;
	}
	
	
}
