package String;

public class Palindrome {
  public static void main(String[] args) {
    String str = "MADAM";
    String reverse="";
   
    for(int i=str.length()-1;i>=0;i--)
    {
      reverse = reverse + str.charAt(i);
    }
    if (reverse.equals(str)) {
       System.out.println("Palindrome");
         }       
    else {
    System.out.println("Not Palindrome");
     }
  }  
}
/*
Challenge #2 – Palindrome

Now let's increase the difficulty.

Problem

Check whether a string is a palindrome.

A palindrome reads the same forwards and backwards.

Example 1
String str = "MADAM";

Output:

Palindrome
Example 2
String str = "HELLO";

Output:

Not Palindrome */