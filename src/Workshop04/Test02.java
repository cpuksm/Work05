package Workshop04;

public class Test02 {

	public static void main(String[] args) {
		int sum =0;
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for(int i=0; i<arr.length; i++) {
			
			if(i%2 !=0) {
				sum += arr[i];
			}
		}//for
		System.out.println("sum="+sum);

	}

}
