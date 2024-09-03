import java.util.Scanner;
class Table{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(n+"*"+t+"="+n*t);
			n--;
		}
	}
}
			
		
		
					
			 