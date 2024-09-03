import java.util.Scanner;
import java.util.Stack;
class stack4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<character> st=new Stack<>();
        String str=sc.next();
        boolean flag = false;
        char ch=sc.next().charAt(0);

        
        for(int i=0;i<str.length;i++){
            char ch1=str.charAt(i);
            st.push(ch1);
            
        }
        for(int i=0;i<str.length;i++){
            char ch2=st.pop();
            if(ch2==ch){
                flag=true;
            }
            if(flag){
                System.out.println("Found");
            }
            else{
                System.out.println("Not Found");
            }
        }
    }
}