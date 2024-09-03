import java.util.Scanner;

class Nonrepeatingstrings{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
				
		for(int i=0;i<s.length();i++){
			int temp=0;
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i) == s.charAt(j)){
					temp=1;
					break;
				}
			}
			if(temp==0){
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}
				
				
				