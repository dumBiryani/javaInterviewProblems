/* Program that returns false if input array has duplicate characters (Similar to leetcode 217)
Using LinkedHashSet here because it retains the insertion order of the SET. 
Problem can be solved using HashSet as well. 
mySet.add() method returns flase if element is already present in the set
Complexity: Constant time performance => O(1)
*/

import java.util.*;

public class uniquechar {
    
    public static void main (String args[])
    {
        boolean result=false;
        String inputstring="Aweeeeeome is my life.";
        System.out.println("Input: "+inputstring);
        //HashSet < Character> uniquecharset= new HashSet();
        LinkedHashSet < Character> uniquecharset = new LinkedHashSet();
        for(int i=0;i < inputstring.length();i++)
        {
            uniquecharset.add(inputstring.charAt(i));
            result=uniquecharset.add(inputstring.charAt(i));
            if (result == false){
                System.out.println("String contains does not duplicates: "+result); 
                break;
            }
        }
    }
}

