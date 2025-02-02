
public class FrequencyAsked {

	public static void main(String[] args) { // margorp edoc avaj
//		int a = 10;
//		int b = 5;
//
//		int temp = a;
//
//		a = b;
//		b = temp;

//		String a = "java";
//		String b = "c#";
//
//		a = a + b;
//		b = a.substring(0, a.length() - b.length());
//		a = a.substring(b.length());
//
//		System.out.println("value a:" + a);
//		System.out.println("value b:" + b);

		// ----------------------------------//

		String a = "java code program";

		String[] word = a.split(" ");

		for (String r : word) {

		}
		System.out.println(reverseMe(a));

	}

	public static String reverseMe(String s) {

		String rev = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
