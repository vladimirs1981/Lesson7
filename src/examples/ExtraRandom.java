package examples;

import java.util.Random;

public class ExtraRandom extends Random {

	public char nextLetter() {
		int rando = new Random().nextInt(123 - 97) + 97;
		char randomChar = (char) rando; // use an int cast to convert the random number to a char
		return randomChar;
	}

	@Override
	public String toString() {
		return "Jason is lame.";
	}

	public static void main(String[] args) {
		System.out.println(new ExtraRandom());
	}

}
