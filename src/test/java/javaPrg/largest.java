package javaPrg;

public class largest {

	public static void main(String[] args) {
		int arr[] = { 12, 45, 56, 23, 55 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];
			} else {
				if (arr[i] < min) {

					min = arr[i];
				}
			}
		}
		System.out.println(max + "  " + min);
	}

}
