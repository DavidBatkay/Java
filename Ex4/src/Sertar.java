
public class Sertar {

	private int width, length, height;

	public Sertar(int width,int length,int height) 
	{
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public Sertar() 
	{
		this(1,1,1);
	}
	
	public void tipareste()
	{
		System.out.println("Sertar "+this.width+" "+this.length+" "+this.height);
	}

	public int getHeight() 
	{
		return height;
	}
	
	public int getWidth() 
	{
		return width;
	}
	
	public int getLength()
	{
		return length;
	}
}
