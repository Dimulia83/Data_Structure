package Lists;

/*
 * Very similar with Array
 * Vector is synchronized 
 */
import java.util.Vector;

public class Vector_Example {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();
		vector.add("Apple");
		vector.add("Dendy");
		vector.add("Samsung");
		System.out.println(vector);

		vector.addElement("LG");
		System.out.println(vector);
	}

}
