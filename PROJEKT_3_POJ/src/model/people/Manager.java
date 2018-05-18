package model.people;

public class Manager extends Person {

	private double managementAdd;	// Manager only
	private int mobilephone;		// Manager only
	private String department;		// Manager only

/*
 *   Gettery i settery
 */		
	public double getManagementAdd() {
		return managementAdd;
	}
	public void setManagementAdd(double managementAdd) {
		this.managementAdd = managementAdd;
	}
	public int getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(int mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
/*
 *   Metody
 */	
	protected void modifySalary() {
		salary += salary * premiumRate + managementAdd;
		
	}

	protected String modifyString() {
		return
				" |precent do premii: " + premiumRate +
				" |Management add: " + managementAdd + 
				" |tel: " + telephone +
				" |mobile: " + mobilephone +
				" |room: " + room +
				" |dept: " + department ;
	}	
}
