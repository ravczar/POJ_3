package model.people;

public class BoardMember extends Person{
	
	private String assistant;		 // Member only - czy ma asystenta
	private int attendance;			 // Member only - liczba obecnosci na spotkaniach
	private double attendanceAdd;	 // Member only - kwota za jedno spotkanie rady (uczestnictwo)

/*
 *   Gettery i settery
 */	
	public String getAssistant() {
		return assistant;
	}
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}	
	public double getAttendanceAdd() {
		return attendanceAdd;
	}
	public void setAttendanceAdd(double attendanceAdd) {
		this.attendanceAdd = attendanceAdd;
	}
	
/*
 *   Metody
 */	
	protected void modifySalary() {
		salary += attendance * attendanceAdd;
		
	}

	protected String modifyString() {
		return
				" |Dodatek za obecnosc: " + attendanceAdd +
				" |Asystent: " + assistant +
				" |Obecnosc: " + attendance;
	}
}
