package examples.countries;

public class Country {

	private String capitalCity;
	
	public Country(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	void dance() {
		System.out.println("Woohoo we're dancing!");
	}

	public String getCapitalCity() {
		return "The capital is " + capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	
}
