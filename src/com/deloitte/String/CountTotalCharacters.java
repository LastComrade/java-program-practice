package com.deloitte.String;

public class CountTotalCharacters {
	public static void main(String[] args) {
		CountTotalCharacters solve = new CountTotalCharacters();
		System.out.println(solve.ctc("The best of both worlds"));
	}

	private int ctc(String input) {
		int ans = 0;
		
		for (int i=0; i<input.length(); i++) {
			if (input.charAt(i) != ' ')
				ans++;
		}
		
		return ans;
	}
}
