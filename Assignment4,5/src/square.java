public class square implements polygon {
	float side;
	
	public square(float x) {
		this.side=x;
		
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public void area(float x) {
	
		System.out.println("Area of Sqaure:"+x*x);
		
	}

	@Override
	public void perimeter(float length, float breadth) {
	
		
	}
	

}

