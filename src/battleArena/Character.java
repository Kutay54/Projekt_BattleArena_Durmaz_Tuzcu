package battleArena;

public abstract class Character {

	private String name;
	private double lifePoints;
	private int attackStrength;
	

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
	
	public int getAttackStrength() {
		return attackStrength;
	}


	public void setAttackStrength(int attackStrength) {
		this.attackStrength = attackStrength;
	}

	public boolean isSpecialAbilityDevice() {
		return specialAbilityDevice;
	}


	public void setSpecialAbilityDevice(boolean specialAbilityDevice) {
		this.specialAbilityDevice = specialAbilityDevice;
	}
	
	

	public abstract void getDamage (int points);	
	public abstract void attack (Character enemy);
	public abstract void isSpecialAbilityactive();
	public abstract void isSpecialAbilitydeactive();
	}
