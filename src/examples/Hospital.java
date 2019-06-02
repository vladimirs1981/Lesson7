package examples;

import java.util.ArrayList;

public class Hospital {

	public static void main(String[] args) {

		GeneralPractitioner hippocrates = new GeneralPractitioner();

		Surgeon watson = new Surgeon();

		ArrayList<Doctor> staff = new ArrayList<Doctor>();
		staff.add(hippocrates);
		staff.add(watson);

		for (Doctor doctor : staff) {
			doctor.doMedicine();
			System.out.println(doctor.getColorOfCoat());
		}

	}

}
