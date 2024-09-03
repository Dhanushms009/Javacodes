import java.util.Scanner;
class Digit{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int temp=1;
		while(n!=0){
			i=n%10;
			n=n/10;
			temp=i*temp;
			}
			System.out.println(temp);
		}
}
			
