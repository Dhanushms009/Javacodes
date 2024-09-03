import java.util.Scanner;
class Shape
{
	void getArea(int len)
	{
		int square=(len*len);
		System.out.println("Square : "+square);
	}
}

class Rectangle extends Shape
{
	void getArea(int len,int brth)
	{
		int area=(len*brth);
		System.out.println("Area : "+area);

	}
}

class Shapes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		int brth=sc.nextInt();
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		s.getArea(len);
		r.getArea(len,brth);
	}
}
		