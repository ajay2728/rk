package com.cg.repo;

import java.util.HashMap;
import java.util.Map;

public class UserCredentials {

	public static Map<String, Integer> creds = new HashMap<String, Integer>();
	static {
		creds.put("Ajay", 8142);
	}

	public static void insertValues(String a, Integer b) {
		creds.put(a, b);
		System.out.println("Successfully registered");
	}

	public static boolean evaluate(String key) {
		boolean flag = false;
		if (creds.containsKey(key)) {
			flag = true;
		}
		return flag;
	}
}