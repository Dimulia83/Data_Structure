package Set_Examples;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * implement unique and sort
 */
public class TreeSet_Example {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		SortedSet<String> sortedSet = new TreeSet<>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("two");
		set.add("five");
		set.add("four");
		
		sortedSet.add("1");
		sortedSet.add("5");
		sortedSet.add("4");
		sortedSet.add("3");
		sortedSet.add("2");
		sortedSet.add("3");
		sortedSet.add("5");
		sortedSet.add("3");
		
		System.out.println(set+" Set");//	[five, four, one, three, two] Set
		System.out.println(sortedSet+" SortedSet");//	[1, 2, 3, 4, 5] SortedSet
		
		
	}

}
