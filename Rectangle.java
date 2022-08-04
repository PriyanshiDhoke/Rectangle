
public class Rectangle {

	int length;
	int breadth;
	
	public Rectangle()
	{
		length=0;
		breadth=0;
	}
	
	public Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void InfoRectangle() {
		
		System.out.println("Length of Rectangle is: "+length);
		System.out.println("Breadth of Rectangle is: "+breadth);
	}
	public void CalcArea()
	{
		int area;
		area = length * breadth;
		
		System.out.println("Area of Rectangle is:" + area);
	}
	
		
}
