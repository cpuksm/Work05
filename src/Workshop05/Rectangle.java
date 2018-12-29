package Workshop05;

public class Rectangle extends Shape implements Resize {
	
	

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}
	
	public double getArea() {
		return (double) this.getHeight()*this.getWidth();
		
	}

	@Override
	public void setResize(int size) {
		this.setWidth(this.getWidth()+size);

	}

}
