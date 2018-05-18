package model.main;

import java.time.LocalDate;

import javax.sound.midi.Track;

import model.people.BoardMember;
import model.people.Manager;
import model.people.MentalWorker;
import model.people.PhysicalWorker;
import model.people.Trainee;

public class Main {

	public static void main(String[] args) {
		MentalWorker minion = new MentalWorker();
		minion.setName("Andrzej");
		minion.setSurname("Maruda");
		minion.setDateOfBirth(LocalDate.of(1989, 9, 29));
		//minion.setRate(10.5);
		//minion.setHourCount(200);
		minion.setSalary(2000);
		//minion.setOvertimeCount(10);
		//minion.setAttendanceAdd(100);
		minion.setWhoIsManager("Judas Priest");
		minion.setPremiumRate(0.05);
		//minion.setManagementAdd(1000);
		//minion.setSkills("Spawanie");
		minion.setTelephone(3053570);
		//minion.setMobilephone(505572351);
		//minion.setHasScholarship(true);
		//minion.setWhoCares("Martyna Mro¿ek");
		minion.setRoom(505);
		//minion.setDepartment("Ukraince");
		//minion.setAttendance(10);
		
		System.out.println(minion);		
	}
}
