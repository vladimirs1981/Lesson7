package examples;

public class Surgeon extends Doctor {

	Surgeon() {
		super("green");
	}

	void doMedicine() {

		System.out.println("Slicing the patient");
	}

	void performSurgery() {
		System.out.println("Please don't disturb, butchering!");
	}

}
