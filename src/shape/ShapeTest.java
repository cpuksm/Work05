package shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape[] = new Shape[6];

		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(5, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");

		System.out.println("�⺻����");
		
		for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Triangle) {
				 
				System.out.printf("%s %6.1f %5s\n","Triangle",shape[i].getArea(),shape[i].getColors());
			}else if(shape[i] instanceof Rectangle) {
				
				System.out.printf("%s %5.1f %5s\n","Rectangle",shape[i].getArea(),shape[i].getColors());
			}
		}
			System.out.println();
			System.out.println("����� ���� �� ����");
			for (int i = 0; i < shape.length; i++) {
				if(shape[i] instanceof Triangle) {
					((Triangle) shape[i]).setResize(5);
					 
					System.out.printf("%s %6.1f %5s\n","Triangle",shape[i].getArea(),shape[i].getColors());
				}else if(shape[i] instanceof Rectangle) {
					((Rectangle) shape[i]).setResize(5);
					
					System.out.printf("%s %5.1f %5s\n","Rectangle",shape[i].getArea(),shape[i].getColors());
				}

		
		}

	}

}
