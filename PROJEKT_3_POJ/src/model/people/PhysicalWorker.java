package model.people;

public class PhysicalWorker extends Person {
	
	private double rate;			// Pracownik fizyczny
	private double hourCount;		// Pracownik fizyczny
	private double overtimeCount;	// Pracownik fizyczny
	private String skills;			// Pracownik fizyczny
	
/*
 *   Gettery i settery
 */	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getHourCount() {
		return hourCount;
	}
	public void setHourCount(double hourCount) {
		this.hourCount = hourCount;
	}
	public double getOvertimeCount() {
		return overtimeCount;
	}
	public void setOvertimeCount(double overtimeCount) {
		this.overtimeCount = overtimeCount;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
/*
 *   Metody
 */
	protected void modifySalary() {
		salary = rate * hourCount + rate*1.5* overtimeCount;
	}
	
	protected String modifyString() {
		return 
				" |Rate: " + rate + 
				" |Hour ct: " + hourCount +
				" |Overtime ct: " + overtimeCount +
				" |Mened¿er: " + whoIsManager +
				" |Skills: " + skills ;
				
	}



}
