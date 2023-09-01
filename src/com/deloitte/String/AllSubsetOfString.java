package com.deloitte.String;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetOfString {
	
	// O(N^2)
	public List<String> solveUtil(String s) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				list.add(s.substring(i, j + 1));
			}
		}

		return list;
	}

	public static void main(String[] args) {
		AllSubsetOfString solve = new AllSubsetOfString();
		List<String> strArr = solve.solveUtil("FUN");

		for (String s : strArr) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
