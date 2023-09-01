package com.deloitte.String;

public class CountPunctuations {
	public int solveUtil(String s) {
		int result = 0;
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '\'' || s.charAt(i) == '-' || s.charAt(i) == '\"' || s.charAt(i) == '?' || s.charAt(i) == ';' || s.charAt(i) == ':') {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		CountPunctuations solve = new CountPunctuations();
		System.out.println(solve.solveUtil("He said, 'The mailman loves you.' I heard it with my own ears."));
	}
}
