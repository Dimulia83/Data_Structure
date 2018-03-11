package map;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

	public static void main(String[] args) {
		
		//K,V
		Map<String, Double> menu = new HashMap<>();
		menu.put("Coffee", 2.99);
		menu.put("Cappucino", 3.99);
		menu.put("Hot Chocolate", 3.49);
//		menu.put("Hot Chocolate", 3.55);
//		System.out.println(menu);//	{Coffee=2.99, Hot Chocolate=3.55, Cappucino=3.99}
		
		//how to find out how many elements:
		System.out.println(menu.size());//	3
		
		System.out.println(menu);//	{Cappucino=3.99, Coffee=2.99, Hot Chocolate=3.49}
		
		//how much is coffee:
		System.out.println(menu.get("Coffee"));//	2.99 will give the value
		
		System.out.println(menu.keySet());//	[Cappucino, Coffee, Hot Chocolate]
		System.out.println(menu.values());//	[2.99, 3.49, 3.99]
		
//		//remove:
//		menu.remove("Hot Chocolate");
//		System.out.println(menu);//	{Coffee=2.99, Cappucino=3.99}
		
		menu.replace("Coffee", 2.33);
		System.out.println(menu);//	{Coffee=2.33, Hot Chocolate=3.49, Cappucino=3.99}
		
		if(menu.containsKey("Coffee")) System.out.println("Coffee is there!");//	Coffee is there!
		
		//how to find key by value:
		//need to loop and check the values
		
		menu.put("reg coffee", menu.get("Coffee"));
		System.out.println(menu);//	{reg coffee=2.33, Coffee=2.33, Hot Chocolate=3.49, Cappucino=3.99}

	}

}
