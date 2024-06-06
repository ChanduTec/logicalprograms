package vamshi_bhavaniCodeing.com.chandu.in;

public class SwapTwoValues {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a);// 10
		System.out.println(b);// 20
		a = a + b;// 30
		b = a - b;// 30-20//10
		a = a - b;

		System.out.println(a);//20
		System.out.println(b);// 10
	}
}
