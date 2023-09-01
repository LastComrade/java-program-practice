package com.deloitte.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
	// O(N)
	boolean isAnagramByMap(String a, String b) {
		if (a.length() != b.length())
			return false;

		a = a.toLowerCase();
		b = b.toLowerCase();
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
		}

		for (int i = 0; i < a.length(); i++) {
			if (map.containsKey(b.charAt(i))) {
				map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
				if (map.get(b.charAt(i)) == 0) {
					map.remove(b.charAt(i));
				}
			}
		}

		return map.size() == 0;
	}

	// O(N * log(N))
	boolean isAnagramBySorting(String a, String b) {
		if (a.length() != b.length())
			return false;

		a = a.toLowerCase();
		b = b.toLowerCase();
		String[] aCharArr = a.split("");
		String[] bCharArr = b.split("");
		Arrays.sort(aCharArr);
		Arrays.sort(bCharArr);

		for (int i = 0; i < aCharArr.length; i++) {
			if (aCharArr[i].equals(bCharArr[i]) == false) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		IsAnagram solve = new IsAnagram();
		System.out.println(solve.isAnagramByMap("Brag", "Grab"));
	}
}
