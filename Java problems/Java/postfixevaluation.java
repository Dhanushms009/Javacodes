import java.util.Scanner;
import java.util.Stack;
class postfixevaluation{
	public static void main(String[] args){
		Stack<Integer> number = new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the expression : ");
		String str=sc.next();
		int k=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9'){
				number.push(ch - '0');
			}
			else{
				switch(ch){
					case '+':
						k=number.pop()+number.pop();
						number.push(k);
						break;
					case '-':
						k=number.pop()-number.pop();
						number.push(k);
						break;
					case '*':
						k=number.pop()*number.pop();
						number.push(k);
						break;
					case '/':
						k=number.pop()/number.pop();
						number.push(k);
						break;
					default:
						System.out.println("Invalid");
					}
			}
		}
		System.out.println(number.pop());
	}
}
			
				
			
			
		
		