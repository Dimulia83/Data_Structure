package Lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	/*
	 * LinkedList faster than ArrayList
	 * Good for add() and remove() methods
	 * Searching is slow
	 */

	public static void main(String[] args) {
		List<String> linkedLn = new LinkedList<>();
		linkedLn.add("John");
		linkedLn.add("ViJay");
		linkedLn.add("Dima");
		linkedLn.add("Ilia");
		linkedLn.add("Bob");
		linkedLn.add("Mark");
		
		System.out.println(linkedLn.size()+" "+linkedLn);//	6 [John, ViJay, Dima, Ilia, Bob, Mark]
		System.out.println(linkedLn.indexOf("Dima"));//	2
		
		LinkedList<String> linkedL = (LinkedList<String>)linkedLn;
		linkedL.addFirst("epson");
		System.out.println(linkedL);//	[epson, John, ViJay, Dima, Ilia, Bob, Mark]
		
		linkedL.addLast("Dell");
		System.out.println(linkedL);//	[epson, John, ViJay, Dima, Ilia, Bob, Mark, Dell]
		
		linkedL.add(2,"HP");
		System.out.println(linkedL);//	[epson, John, HP, ViJay, Dima, Ilia, Bob, Mark, Dell]
		
		System.out.println(linkedL.removeFirst());//	epson
		System.out.println(linkedL);//	[John, HP, ViJay, Dima, Ilia, Bob, Mark, Dell]
		
		//	delete first element
		linkedL.poll();//	will not throw Exception
		System.out.println(linkedL);// [HP, ViJay, Dima, Ilia, Bob, Mark, Dell]
		
		//	print first element
		System.out.println(linkedL.peekFirst());//	HP
		
					//*****Searching*****\\
		System.out.println(linkedL.get(2));//	Dima
		

	}

}
