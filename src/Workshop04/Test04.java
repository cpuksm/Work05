package Workshop04;

public class Test04 {

	public static void main(String[] args) {
		int Sum = 0;
		Sum = Calc.calcSum(Integer.parseInt(args[0]),
				Integer.parseInt(args[1]),
				Integer.parseInt(args[2]),
				Integer.parseInt(args[3]));
		
		double Avg =(double) Sum/4;
		char g=0;
		switch((int)Avg/10) {
		case 9: g = 'A'; break;
		case 8:
		case 7: g = 'B'; break;
		case 6:
		case 5: g = 'C'; break;
		case 4:
		case 3: g = 'D'; break;
		default:g = 'F'; break;
	
		}
		System.out.println("Sum:"+Sum);
		System.out.println("Avg:"+Avg);
		System.out.println(g+"ÇÐÁ¡");
		
	}
	
}