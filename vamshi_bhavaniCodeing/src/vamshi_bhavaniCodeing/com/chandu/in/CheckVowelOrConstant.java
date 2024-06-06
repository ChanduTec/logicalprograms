package vamshi_bhavaniCodeing.com.chandu.in;

public class CheckVowelOrConstant {
public static void main(String[] args) {
	String name="chandu";
	char[] charArray = name.toCharArray();
	int length = charArray.length;
	for(int i=0; i<length; i++) {
		if(charArray[i]=='a' || charArray[i]=='e' || charArray[i]=='i' || 
				charArray[i]=='o' ||charArray[i]=='u'  ) {
			System.out.println("Thsi is ovwel charactier--->"+ charArray[i]);
		}
		else {
			System.out.println("Thsi is cononant charactier--->"+ charArray[i]);
		}
	}
}
}
