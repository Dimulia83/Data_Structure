package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("water");
		l.add("coffee");
		l.add("wine");
		l.add("tea");
		l.add("milk");
		System.out.println(l.indexOf("tea"));//	3
		
		String[] array = l.toArray(new String[l.size()]);
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, "wine"));//	4
	
		System.out.println(l);
			l.clear();
		int[][] nums = new int[2][3];
		List<List<Integer>> list;//	nested List such multidimensional array
		
		// will make array bigger
		int[] numbers = {1,4,7,8,5,2};
		System.out.println(Arrays.toString(numbers));
		numbers = Arrays.copyOf(numbers, numbers.length + 5);
		System.out.println(Arrays.toString(numbers));
		
	}

}
