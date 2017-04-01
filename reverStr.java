import java.util.*;

public class reverStr{
	public static void main(String args[]){
	String word = "Hello", sentence = "Hello World How are you?";
	String reverseword = reverseStr(word);
	String reversesentence = reverseSentence(sentence);
	System.out.println(reverseword);
	System.out.println(reversesentence);
	}

	// reverse letters in a word
	public static String reverseStr (String input){
		int i, len = input.length();
		StringBuilder rev = new StringBuilder(len);

		for(i= len-1; i>=0; i--)
			{
    		rev.append(input.charAt(i)); 
			}
		return rev.toString();
		}	
	// reverse words in a sentence
	public static String reverseSentence (String input1){
		String[] wordArr = input1.split(" ");
		int len, i;
		//len = wordArr.length();
		StringBuilder revSentence = new StringBuilder();	
		for (i= wordArr.length -1; i>=0; i--){
			revSentence.append(wordArr[i]).append(" ");
		}	
		return revSentence.toString();
	}
	//reverse letters in a word using stack
	public static String stackreverseStr (String input2){
		StringBuilder stackrev = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		for (int i=0;i<input2.length(); i++){
			stack.push(input2.charAt(i));
		}
		while (!stack.empty()) {
			stackrev.append(stack.pop());
		}
		return stackrev.toString();
	}
}	