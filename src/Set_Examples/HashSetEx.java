package Set_Examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		//Set only allows unique elements
		//does not keep ordering
		
		Set<Integer> uniqueNums = new HashSet();
		uniqueNums.add(123);
		uniqueNums.add(321);
		uniqueNums.add(213);
		uniqueNums.add(312);
		System.out.println(uniqueNums);// do not keep ordering [321, 213, 312, 123]
		
		List<String> list = Arrays.asList("one","two","three","four","five","ten","two","one");
		System.out.println(list);//	[one, two, three, four, five, ten, two, one]
		
		Set<String> setList = new HashSet<>(list);
		System.out.println(setList);//	[four, one, ten, two, three, five]

	}

}
