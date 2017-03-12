/* Program to find first non repeated character in a string
If the word "stress" is input  then it should print  't'   as output
If the word "teeter" is input  then it should print  'r'   as output
*/

import java.util.HashMap;
import java.util.Scanner;

public class repeatedString{
	public static void main (String args[]){
		System.out.println("Enter valid string: ");
		Scanner in = new Scanner(System.in);	
		String str = in.nextLine();
		char c = firstNonRepeatedCharacter(str);
		System.out.println("First non repeated String:"+c);
	}

	public static Character firstNonRepeatedCharacter(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i; 
		char character;
		for (i =0;i <str.length();i++){
			character = str.charAt(i);
			if(map.containsKey(character))
				map.put(character, map.get(character)+1);
			else 
				map.put(character,1);
		}
		for (i =0;i<str.length();i++){
			character=str.charAt(i);
			if (map.get(character) == 1)
				return character;
		}
		return '\0'; // return NULL character if there is no non repeated character in the string
	}
}