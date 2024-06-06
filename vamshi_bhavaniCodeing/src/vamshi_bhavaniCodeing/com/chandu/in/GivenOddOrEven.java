package vamshi_bhavaniCodeing.com.chandu.in;

import java.util.Scanner;

public class GivenOddOrEven {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please eneter the number");
		int nextInt = scanner.nextInt();
		if (nextInt % 2 == 0) {
			System.out.println("This given number is even number-->" + nextInt);
		} else {
			System.out.println("This  number is odd number");
		}
	}
}
