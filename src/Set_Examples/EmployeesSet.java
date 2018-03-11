package Set_Examples;
/*
 * if we override the equals and hashCode the output will unique(do not repeating values)
 */
import java.util.HashSet;
import java.util.Set;

public class EmployeesSet {

	public static void main(String[] args) {
		
		Set<Employee> emploees = new HashSet<>();
		emploees.add(new Employee(123, " Mark"));
		emploees.add(new Employee(555,"John"));
		emploees.add(new Employee(123, " Mark"));
		
		
		System.out.println(emploees.toString());//	[id: 555; name: John, id: 123; name:  Mark]

	}

}
