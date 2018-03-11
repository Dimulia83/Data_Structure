package queue;
//first in first out
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Example {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		q.add("Delta");
		q.add("Quatar");
		q.add("America");
		q.add("Turkish");
		System.out.println(q);//	[America, Quatar, Delta, Turkish]
		
		System.out.println(q.peek());//	America
		

	}

}
