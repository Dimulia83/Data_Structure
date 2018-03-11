package Set_Examples;
/*
 * if we override the equals and hashCode the output will unique(do not repeating values)
 */
import java.util.HashSet;
import java.util.Set;

public class EmployeesSet {

	public static void main(String[] args) {
		
		Set<Emploee> emploees = new HashSet<>();
		emploees.add(new Emploee(123, " Mark"));
		emploees.add(new Emploee(555,"John"));
		emploees.add(new Emploee(123, " Mark"));
		
		
		System.out.println(emploees.toString());

	}

}
