package vamshi_bhavaniCodeing.com.chandu.in;

import java.util.HashMap;

//Frequency of a charactier in given string using java 8
public class FrequencyOfCharactier {

	public static void main(String[] args) {
		String name = "JavaProgramming";
		HashMap<String, Integer> hashMap = new HashMap<>();
		Integer put = hashMap.put("chandu", 234);
		int[] freq = new int[name.length()];
		int i, j;
		char string[] = name.toCharArray();

		for (i = 0; i < name.length(); i++) {

			freq[i] = 1;
			for (j = 1; j < name.length(); j++) {
				if (string[i] == string[j]) {
					freq[i]++;

					string[j] = '0';
				}

			}

		}
		System.out.println("givebn repeted ");
		for (i = 0; i < freq.length; i++) {
//		 if(string[i]!= && string[i]!='0') {
//			 
//		 }
		}
	}
}