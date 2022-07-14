public class Rectangle 
{
	private double len, w;
	
	//create constructor that accepts length and width as arguments.
	public Rectangle(double length, double width)
	{
		len = length;
		w = width;
	}
	
	//mutator method for length
	public void setLength(double length)
	{
		length = len;
	}
	
	//mutator method for width
	public void setWidth(double width)
	{
		width = w;
	}
	//accessor method for length
	public double getLength()
	{
		return len;
	}
	public double getWidth()
	{
		return w;
	}
	public double computePerimeter()
	{
		double perimeter = 2*len+2*w;
		return perimeter;
	}
	public double computeArea()
	{
		double area = len*w;
		return area;
	}
}
