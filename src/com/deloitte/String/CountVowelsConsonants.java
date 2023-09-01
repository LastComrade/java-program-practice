package com.deloitte.String;

public class CountVowelsConsonants {
	public CountVowelsConsonants(String string) {
		for (int x : solve(string)) {
			System.out.println(x);
		}
	}

	private int[] solve(String string) {
		int vowels = 0;
		int consonants = 0;
		string = string.toLowerCase();
		
		for (int i=0; i<string.length(); i++) {
			// Count vowels
			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
				vowels++;
			else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
				consonants++;
		}
		
		return new int[] {vowels, consonants};
	}

	public static void main(String[] args) {
		new CountVowelsConsonants("This is a really simple sentence");

	}
}
