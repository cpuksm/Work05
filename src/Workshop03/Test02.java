package Workshop03;

public class Test02 {

	public static void main(String[] args) {
		int i =0;
		int j =0;
		
		while(i<= 10) {
			
			while(j <= i) {
			System.out.print("*");
			j++;
			}
			
			i++;
			j=0;
		  System.out.println();
		}
	}
}

