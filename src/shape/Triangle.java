package shape;

public class Triangle extends Shape implements Resize {
	
	

	public Triangle() {
		super();
		
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		
	}
	
	public double getArea() {
		return (double) this.getHeight()*this.getWidth()/2;
		
	}

	@Override
	public void setResize(int size) {
		setHeight(this.getHeight()+size);
	}

}
