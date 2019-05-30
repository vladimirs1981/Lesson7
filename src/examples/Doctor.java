package examples;

public class Doctor {

	private String colorOfCoat;

	public Doctor(String colorOfCoat) {
		this.colorOfCoat = colorOfCoat;
	}

	public String getColorOfCoat() {
		return "Wearing a " + colorOfCoat + " coat.";
	}

	public void setColorOfCoat(String colorOfCoat) {
		this.colorOfCoat = colorOfCoat;
	}

	void doMedicine() {
		System.out.println("Patient overview");
	}

}
