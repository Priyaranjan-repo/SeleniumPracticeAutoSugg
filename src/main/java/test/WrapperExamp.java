package test;

public class WrapperExamp {

	public static void main(String[] args) {

		String s = "290";

		System.out.println(s + 20);

		int d = Integer.parseInt(s);// 29020

		System.out.println(d + 50);// 340

		String df = "12.65";

		double f = Double.parseDouble(df);

		System.out.println(f);

		// strig to bbolean;
		String fhj = "true";

		boolean b = Boolean.parseBoolean(fhj);

		System.out.println(b);

		// int to string conversion use String.valueOf(u);

		int u = 400;

		String f1 = String.valueOf(u);
		System.out.println(f1 + 345);

		String d1 = "233t";
		String fgf = String.valueOf(d1);
		System.out.println(fgf);

	}
}