
public class CountWithoutForLoop {

	public static void main(String[] args) {

		String str = "Software";

		char[] word = str.toCharArray();
		int count = 0;

		for (char s : word) {
			count++;

		}
		System.out.println(count);

	}

}
