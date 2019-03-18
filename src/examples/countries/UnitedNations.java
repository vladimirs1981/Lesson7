package examples.countries;

import java.util.ArrayList;

public class UnitedNations {
	public static void main(String[] args) {
		Serbia serbia = new Serbia();
		
		Ireland eire = new Ireland();
		
		
		ArrayList<Country> countries = new ArrayList<Country>();
		countries.add(eire);
		countries.add(serbia);
		countries.add(new Brazil());
		
		for (Country country : countries) {
			country.dance();
		}
	}

}
