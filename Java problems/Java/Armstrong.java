import java.util.Scanner;
class Armstrong{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int rem,b=0,c=0,t=0;
		while(a>0){
			a=a/10;
			c++;
		}
		while(a>0){
			rem=a%10;
			b=b+Math.pow(rem,c);
			a=a/10;
		}
		if(b==t)
		System.out.println("Armstrong number");
		else
		System.out.println("Not an Armstrong number");
	}
}
