package list_examples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(10);
		list.add(22);
		list.add(5);
		
		System.out.println(list);
		
		for(Integer x: list) {
			System.out.print(x + " ");
		}
	}
}
