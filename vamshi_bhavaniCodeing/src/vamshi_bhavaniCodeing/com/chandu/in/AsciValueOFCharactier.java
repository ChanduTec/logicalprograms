package vamshi_bhavaniCodeing.com.chandu.in;

import java.util.Scanner;

public class AsciValueOFCharactier {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any Charactier");
		String nextLine = scanner.nextLine();
		System.out.println("Given String  is-->" + nextLine);

		char[] charArray = nextLine.toCharArray();
		int length = charArray.length;

		for (int i = 0; i <= length-1; i++) {
			int ascivalue;
			ascivalue = charArray[i];
			System.out.println("Asci value of the charactier is-->" + charArray[i]+"---"+ ascivalue);
		}
	}
}