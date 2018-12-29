package Workshop04;

public class Test03 {

	public static void main(String[] args) {
		int total = 0;
		double average = 0;
		
		int[][] arr2 = { { 5, 5, 5, 5, 5}, 
				{10,10,10,10,10}, 
				{20,20,20,20,20}, 
				{30,30,30,30,30} }; 
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++)
			total += arr2[i][j];
			average =(double) total/(arr2.length*arr2[i].length);
			
		}
		System.out.println("total="+total);
		System.out.println("average="+average);

	}

}
