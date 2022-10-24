package set_examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();

		System.out.println(set.add(10));
		System.out.println(set.add(10));
		System.out.println(set.add(22));
		System.out.println(set.add(5));
		
		System.out.println(set);
		
		for(Integer x : set) {
			System.out.print(x + " ");
		}
	}
}
