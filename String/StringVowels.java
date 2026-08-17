package String;

public class StringVowels {
    public static void main(String[] args) {
      String str = "Hello";
        int vowels=0;
        int consonants=0;  
      for(int i=0;i<str.length();i++)
      {
       if (str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u')
          {
           vowels++;
          }
       else
       {
        consonants++;
       }
      }
      System.out.println("vowels =  " +vowels + " consonants =  " +consonants);
    }
}

/*
Challenge (#3)

Count the number of vowels and consonants in a string.

Example:

String str = "Hello";

Output:

Vowels = 2
Consonants = 3

This problem will teach you:

charAt()
Character comparison
Multiple if conditions
Counting with variables */