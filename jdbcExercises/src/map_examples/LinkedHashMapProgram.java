package map_examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapProgram {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(10, "Helsinki");
		map.put(10, "Porvoo");
		map.put(22, "Espoo");
		map.put(5, "Vantaa");
		;

		System.out.println(map);

		System.out.println(map.get(10));

		for (String city : map.values()) {
			System.out.print(city + " ");
		}
	}

}
