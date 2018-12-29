package Workshop02;

import java.util.Arrays;

public class TvTest {

	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA ", 2000000, " 3D TV");

		for (int i = 0; i < tvArray.length; i++) {
			System.out.println(tvArray[i]);
		
		}
		
		Tv temp1 = null;
		Tv temp2 = null;
		for (int i = 0; i < tvArray.length; i++) {
			for (int j = 0; j < tvArray.length; j++) {
				if (tvArray[i].getPrice() > tvArray[j].getPrice()) {
					temp1 = tvArray[i];
				}
				if (tvArray[i].getPrice() < tvArray[j].getPrice()) {
					temp2 = tvArray[i];
				}
			}
		}

			System.out.println("가격이 가장 비싼 제품:" + temp1.getName());
			System.out.println("가격이 가장 저렴한 제품:" + temp2.getName()				);

	}
	
}

