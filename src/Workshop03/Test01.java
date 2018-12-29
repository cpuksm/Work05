package Workshop03;

public class Test01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			// System.out.println(i);
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		} // for
		System.out.println("sum = " + sum);
	}// main
}
