import java.util.Scanner;
import java.util.Stack;

public class balanceparenthesis{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') 
				stack.push(ch);
			else {
				if(stack.isEmpty()) {
					System.out.println("Unbalanced");
					stack.push('}');
					break;
				}
				if(ch==')') {
					char top=stack.peek();
					if(top!='(') {
						System.out.println("Unbalanced");
						break;
					}stack.pop();
				}
				if(ch=='}') {
					char top=stack.peek();
					if(top!='{') {
						System.out.println("Unbalanced");
						break;
					}
					stack.pop();
				}
				
				if(ch==']') {
					char top=stack.peek();
					if(top!='[') {
						System.out.println("Unbalanced");
						break;
					}
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) 
			System.out.println("Balanced");

	}

}