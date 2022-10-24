package set_examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();

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
