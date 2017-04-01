
import java.util.*;
public class IsBalanced {
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<Character>();
        for(int i =0;i< s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case '(':case '{': case'[': myStack.add(c);break;
                case ')': if(myStack.size() ==0 || myStack.pop() != '(' ){ return false;} break;
                case '}': if(myStack.size() ==0 || myStack.pop() != '{' ){ return false;} break;
                case ']': if(myStack.size() ==0 || myStack.pop() != '[' ){ return false;} break;
                default: continue;
            }
        }
        // if stack is empty after the full length of the string is traversed then brackets are balanced
        if (myStack.size() == 0){
            return true;}
        else 
            {return false;}
        }

    public static void main (String args[]){
        String s = "{[}]";
        boolean var = isValid(s);
        System.out.println(var);
    }
    }