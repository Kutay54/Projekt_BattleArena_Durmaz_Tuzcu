package battleArena;

public abstract class Character {

	private String name;
	private double lifePoints;
	private boolean specialAbilityDevice;
	
	
	public Character(String name) {
		this.name = name;
		this.lifePoints = 100;
		this.specialAbilityDevice = true;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getLifePoints() {
		return lifePoints;
	}


	public void setLifePoints(double lifePoints) {
		this.lifePoints = lifePoints;
	}


	public boolean isSpecialAbilityDevice() {
		return specialAbilityDevice;
	}


	public void setSpecialAbilityDevice(boolean specialAbilityDevice) {
		this.specialAbilityDevice = specialAbilityDevice;
	}
	
	
	/**
	 * is called when a character has been attacked
	 * is deprived of health points as a result. 
	 * @param points
	 */
	public void getDamage (int points) {
		
	}
	
	
	public void attack (Character enemy) {
		
	}
	
}
