package String;

public class StringRemoveDuplicate {
    public static void main(String[] args) {
       String str = "banana";
       boolean isDuplicate;
       String current="";
       for(int i=0;i<str.length();i++)
        {
             isDuplicate=false;
             for(int k=0;k<i;k++) // check  if this character was already counted
             {
                if(str.charAt(i) == str.charAt(k))
                {
                    isDuplicate=true;
                    break;
                }
            }  
       
              if (!isDuplicate)
              {
               current = current +str.charAt(i);
              }
             
           
        }
         System.out.println(current); 
    }
}
/*#5: Remove Duplicate Characters

This is one of the most common Java string interview questions.

Problem

Remove duplicate characters from a string while keeping the first occurrence.

Example 1
String str = "banana";
Expected Output
ban

Explanation:

First b → keep
First a → keep
First n → keep
Remaining a, n, a → remove
Example 2
String str = "programming";
Expected Output
progamin
Rules
 Don't use HashSet
 Don't use replace()
 Don't use contains()
 Don't ask for the code.
 Use loops.
 */