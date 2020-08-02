package quadrilateral;

public class square implements polygon {
	float side;
	
	public void Square(float x) {
		this.side=x;
		
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public void calcArea(float x) {
		// TODO Auto-generated method stub
		System.out.println("Area of Sqaure:"+x*x);
		
	}

	@Override
	public void calcPeri(float length, float breadth) {
		// TODO Auto-generated method stub
		
	}
	

}
