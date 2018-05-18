package model.people;

public class MentalWorker extends Person {

/*
 *   Metody
 */	
	protected void modifySalary() {
		salary += salary * premiumRate;
	}

	protected String modifyString() {
		return
				" |precent do premii: " + premiumRate +
				" |Mened¿er: " + whoIsManager +
				" |tel: " + telephone + 
				" |room: " + room;
	}

	
}
