package examples;

import java.util.ArrayList;

public class BetterArrayList extends ArrayList {

	public static ArrayList<Object> array = new ArrayList<Object>();

	public static void print(ArrayList<Object> array) {

		System.out.println(array.toString());
	}

	public static void pop(ArrayList<Object> array) {
		if (array.size() > 0) {
			array.remove(array.size() - 1);
		} else {
			System.out.println("List is empty");
		}
	}

	public static void main(String[] args) {

		BetterArrayList bl = new BetterArrayList();

		bl.add(156);
		bl.add(789);
		bl.add(444);
		bl.add("Mirko");
		bl.add("Slavko");
		print(bl);

		pop(bl);
		pop(bl);
		print(bl);

	}
}
