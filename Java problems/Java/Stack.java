
import java.util.Stack;
class stack{
	public static void main(String[] args){
		Stack<String> animals = new Stack<>();

		animals.push("Dog");
		animals.push("Cat");
		animals.push("Tiger");

		System.out.println("Stack before popping: "+animals);


		animals.pop();
		System.out.println("Stack after popping: "+animals);
	}
}