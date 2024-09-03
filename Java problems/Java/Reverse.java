import java.util.Scanner;
class Reverse{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int rem,b=0;
		while(a>0)
		{
			rem=a%10;
			b=b*10+rem;
			a=a/10;
		}
		System.out.println(b);
	}
}