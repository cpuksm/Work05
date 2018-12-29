package Workshop04;

public class Test01 {

	public static void main(String[] args) {
		int sum=0;
		int avg=0;
		int [] arr = {10,20,30,40,50};
		for(int i=0; i<=arr.length-1; i++) {
			
			sum += arr[i];
			avg = sum/5;
		}
			
			System.out.println("sum="+sum);
			System.out.println("avg="+avg);
		}

}

