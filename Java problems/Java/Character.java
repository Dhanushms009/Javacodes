import java.util.Scanner;
class Character{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch>=0 && ch<=9)
		{
			System.out.println("Digit");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Alphabet");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Symbol");
		}
	}
}
