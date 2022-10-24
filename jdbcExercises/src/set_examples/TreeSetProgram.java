package set_examples;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();

		System.out.println(set.add(10));
		System.out.println(set.add(10));
		System.out.println(set.add(22));
		System.out.println(set.add(5));

		System.out.println(set);

		for (Integer x : set) {
			System.out.print(x + " ");
		}
	}
}
