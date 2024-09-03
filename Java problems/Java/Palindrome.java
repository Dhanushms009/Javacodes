import java.util.Scanner;
class Palindrome{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int rem,b=0;
		int t=a;
		while(a>0)
		{
			rem=a%10;
			b=b*10+rem;
			a=a/10;
		}
		if(b==t)
		System.out.println("Palindrome");
		else
		System.out.println("Not a Palindrome");
		}
}
			