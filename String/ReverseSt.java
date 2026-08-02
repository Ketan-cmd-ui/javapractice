package String;



public class ReverseSt {
   public static void main(String[] args) {
    String str = "HELLO";

    for(int i=str.length()-1; i>=0;i--)
    {
        System.out.println(str.charAt(i));
    }
   } 
}
/*
String Problem #1: Reverse a String
Problem

Given a string, reverse it.

Input
String str = "HELLO";
Expected Output
OLLEH
Another Example
String str = "KETAN";
Expected Output
NATEK
 Rules
 Don't use StringBuilder.reverse()
 Don't use any built-in reverse method.
 Use a loop. */