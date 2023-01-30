package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PersonPhoneNo {

	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<>();
		map.put(9010198946l, "navya");
		map.put(6304381358l, "divya");
		map.put(3040506933l, "sony");
		map.put(2434567898l, "uma");
		map.put(3456545654l, "raji");
		System.out.println(map);

		System.out.println("display the keys ad values");
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		map.putIfAbsent(1234567898l, "vani");
		System.out.println(map);
		Iterator<Long> itr2 = map.keySet().iterator();
		while (itr2.hasNext()) {
			Long key = itr2.next();
			System.out.println("phoneno : " + key + "\tName : " + map.get(key));

		}

		System.out.println("number of entries :" + map.size());
		System.out.println("key of value is :" + map.get(9010198946l));
		System.out.println("updated value is :" + map.replace(3040506933l, "sony", "mamatha"));
		System.out.println(map);
		System.out.println(map.containsValue("divya"));
		Map<Long, String> name = new LinkedHashMap<>();
		name.put(9010198946l, "navya");
		name.put(6304381358l, "divya");
		name.put(3040506933l, "sony");
		name.put(2434567898l, "uma");
		name.put(3456545654l, "raji");

		System.out.println("linkedhashmap is:" + name);
		Iterator<Long> itr3 = name.keySet().iterator();
		while (itr3.hasNext()) {
			Long key = itr3.next();
			System.out.println("phoneNo : " + key + "\tName:" + name.get(key));
		}

	}

}
