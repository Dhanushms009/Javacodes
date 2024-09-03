import java.util.Scanner;
import java.util.Stack;
class infixtopostfix{
    static int priority(char ch){
        int n=0;
        switch(ch){
            case '$':
            case '^':
                n=4;
                break;
            
            case '*':
            case '/':
                n=3;
                break;
            case '+':
            case '-':
                n=2;
                break;
            case '=':
                n=1;
                break;
            default:
                n=0;
                break;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<character> st=new Stack<>();
        for(int i=0;i<str.length;i++){
            char ch=sc.charAt(i);
            if(character.isAlphabetic(ch) || character.isDigit(ch)){
                System.out.println(ch+" ");
            }
            else if(character.isAlphabetic(ch) && character.isDigit(ch)){
                if(ch=='('){
                    st.push();
                }
                else if(ch==')'){
                    char a = ')';
                }
            }
        }
    }
}