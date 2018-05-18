package model.people;

import java.time.LocalDate;

abstract public class Person {
	
	protected String name;				// All
	protected String surname;			// All
	protected LocalDate dateOfBirth; 	// All
	protected double salary;			// All
	protected String whoIsManager;		// Physical & Mental
	protected double premiumRate;		// Mental & Manager
	protected int telephone;			// Mental & Manager
	protected int room;					// Mental & Manager

/*
 *   Gettery i settery
 */	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPremiumRate() {
		return premiumRate;
	}
	public void setPremiumRate(double premiumRate) {
		this.premiumRate = premiumRate;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public String getWhoIsManager() {
		return whoIsManager;
	}
	public void setWhoIsManager(String whoIsManager) {
		this.whoIsManager = whoIsManager;
	}

/*
 *   Metody
 */
	protected abstract String modifyString();
	protected abstract void modifySalary();
	
	@Override
	public String toString() {
		Salary();      				// to powoduje policzenie i przypisanie wartoœci dla wyp³aty
		return 
			"|Name: " + name + 
			" |Surname: " + surname +
			" |Born On: " + dateOfBirth +
			" |SALARY: " + salary + 
			modifyString() ;
	}
	
	protected void Salary() {
		modifySalary();
	}
}
