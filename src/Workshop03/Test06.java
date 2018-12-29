package Workshop03;

public class Test06 {

	public static void main(String[] args) {// args[0]==8
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % Integer.parseInt(args[0]) == 0) {
				
				sum += i;
				if ((100-i)>= Integer.parseInt(args[0])) {
					System.out.printf("%d+", i);

				}else {
					System.out.printf("%d = %d",i,sum);
				}

			}

			
			// System.out.println(i+"+"+i+1+"="+sum);
		}

	}

}
