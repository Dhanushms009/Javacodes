import java.util.Scanner;
class Check{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b=s.nextInt();
		while(a<=b){
			if(a%3==0)
			{
				System.out.println("Hii");
			}
			else if(a%5==0)
			{
				System.out.println("Hello");
			}
			else
			{
				System.out.println(a);
			}
			a++;
		}
	}
}