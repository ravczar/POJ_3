package model.people;

public class Trainee extends Person{

	private boolean hasScholarship;     //Trainee only - czy ma stypendium
	private String whoCares;			//Trainee only - kto sie nim opiekuje

/*
 *   Gettery i settery
 */	
	public boolean isHasScholarship() {
		return hasScholarship;
	}
	public void setHasScholarship(boolean hasScholarship) {
		this.hasScholarship = hasScholarship;
	}

	public String getWhoCares() {
		return whoCares;
	}
	public void setWhoCares(String whoCares) {
		this.whoCares = whoCares;
	}

	/*
 *   Metody
 */	
	protected void modifySalary() {
		if (hasScholarship == true)
			salary = 1600;
		else
			salary = 0;
	}

	protected String modifyString() {
		return
				" |Stypendium: " + hasScholarship + 
				" |Pod opiek¹: " + whoCares ;
	}
}
