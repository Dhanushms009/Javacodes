import java.util.Scanner;
class String1{
	public static void main(String[] args){
		Scanner s  = new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		String sub1=s1.substring(s1.length()-2);
		String sub2=s2.substring(s2.length()-2);
		if(sub1.equals(sub2))
		System.out.println("Equal");
		else
		System.out.println("Not Equal");
	}
}