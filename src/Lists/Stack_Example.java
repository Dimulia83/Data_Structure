package Lists;
//	Deprecated
import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
		// last in first out
		
		Stack<String> stack = new Stack<>();
		stack.push("Java book");
		stack.push("Selenium Cookbook");
		stack.push("OCA");
		stack.push("10X");
		System.out.println(stack.peek());//	without deleting	//	10X
		System.out.println(stack.get(0));//		Java book
		
		System.out.println(stack.search("Java book"));//	4 start counting from end
		

	}

}
