package Set_Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedEmploee {

	public static void main(String[] args) {
		String str1 = "wbc";
		String str2 = "abc";
		System.out.println(str1.compareTo(str2));//	22
		
		Employee emp1 = new Employee(5,"Bob");
		Employee emp2 = new Employee(53,"Mario");
		Employee emp3 = new Employee(15,"John");
		Employee emp4 = new Employee(6,"Super Mario");
		System.out.println(emp1.compareTo(emp2));//	-1
		
		List<Employee> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		
		System.out.println(emps);//	not sorted
		Collections.sort(emps);
		System.out.println(emps);//	sorted
		
		
		
		
	}

}
