import java.util.Scanner;
class Yshape
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int m=a/2;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(j==(a-1-i))
				{
					System.out.print("# ");
				}
				else if(i==j && i<=m)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}