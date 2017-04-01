import java.util.*;

public class LongestSubstringinString{
	public static void LongestSubString(String s){
		if(s == null || s.length() == 0){
			System.out.println("Invalid Input");
		}
		if(s.length() ==1){
			System.out.println(s+"Length = 1");
		}
		char[] sArr = s.toCharArray(); 
		int maxLen =0;
		String LongestStr = null;

		// Create a Linked Hash Map (maintains insertion order) with str as key, position as value 

		LinkedHashMap<Character,Integer> myMap = new LinkedHashMap<Character,Integer>();

		// Add 
		for (int i =0; i< sArr.length; i++){
			char ch = sArr[i];
			if(!myMap.containsKey(ch)){
				myMap.put(ch,i);
			}
			else {
				i = myMap.get(ch);
				myMap.clear();
			}

			if(myMap.size()>maxLen){
				maxLen = myMap.size();
				LongestStr =myMap.keySet().toString();
			}

		}
		System.out.println(LongestStr+","+maxLen);

	} 

	public static void main (String args[]){
		LongestSubString("abcdefghijklmnopq");
		LongestSubString("pwwkew");
		LongestSubString("abcabcbb");
		LongestSubString("bbbbb");
	}
}