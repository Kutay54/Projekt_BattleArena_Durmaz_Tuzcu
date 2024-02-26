package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Character{

	public Dragon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void isSpecialAbilityActive () {
		if(this.isSpecialAbilityDevice() == true) {
			attack(null, ThreadLocalRandom.current().nextInt(5, 10 + 1));
		}
	}
	
	public void deactivateSpecialAbility() {
		if (this.isSpecialAbilityDevice() == false) {
			
		}
	}
	
}
