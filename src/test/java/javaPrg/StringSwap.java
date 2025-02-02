package javaPrg;

public class StringSwap {

	public static void main(String[] args) {

		String a = "java";

		String b = "ruby";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println(a);
		System.out.println(b);

	}

}
