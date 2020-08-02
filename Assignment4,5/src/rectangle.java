public class rectangle implements polygon {
       float length;
       float breadth;
       
       public void rectangle(float a,float b) {
    	   this.length=a;
    	   this.breadth=b;
    	  
       }
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	@Override
	public void area(float side) {

		
	}
	@Override
	public void perimeter(float a, float b) {

		 System.out.println("Area of Rectangle:"+2*(a+b));
	}
}
       