package com.collections.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PancardNo {

	public static void main(String[] args) {
		Map<String, String> number = new TreeMap<>();
		number.put("223344ASDC", "Navya");
		number.put("223344ASDX", "Anu");
		number.put("987865NHBG", "Ganesh");
		number.put("890765ASWE", "Sravan");
		number.put("890765ASWE", "Sravan");//allow the duplicates
	
		System.out.println(number);
		Iterator<String> itr = number.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(" pan number : " + key + "\tname : " + number.get(key));
		}
		System.out.println("number of entries :" + number.size());
		System.out.println("converting map to set");
		
		List<String>link=new ArrayList<>(number.keySet());
		for(String string:link) {
			System.out.println(string);
		}
		
	}
	

}
