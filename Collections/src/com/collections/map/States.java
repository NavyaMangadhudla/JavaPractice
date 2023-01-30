package com.collections.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class States {

	public static void main(String[] args) {
		Map<String, String> state = new Hashtable<>();
		state.put("Telangana", "HYD");
		state.put("AndraPradesh", "HYD");
		state.put("Bangalore", "Karnataka");
		state.put("TamilNadu", "Chennai");
		System.out.println(state);
		// state.put("Kerala", null);//null values are not allow
		System.out.println(state.entrySet());
		System.out.println("" + state.putIfAbsent("Maharashtra", "Mumbai"));
		Set<String> key = state.keySet();
		for (String set : key) {

			System.out.println("states :" + set + "\tcapital is:" + state.get(set));
		}
	}

}
