public class ArrayMissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2,3, 4, 5};
         int expected=1;
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==expected)
            { 
              expected++;
             
            }
            else{
                System.out.println("the missing number is :" +expected);
                found =true;
                break;
            }
           
          
        }
        if(!found)
        {
            System.out.println( "the missing number is  :" +expected);
        }
        
        }
        
    }

/*
Challenge Problem #30
Find the Missing Number

Given an array containing numbers from 1 to n, but one number is missing.

Example:

int[] arr = {1, 2, 4, 5, 6};
Expected Output
Missing Number = 3

Another example:

int[] arr = {2, 3, 1, 5};

Output:

Missing Number = 4
Rules (same as before)

 Don't ask for the code.

First tell me:

Your algorithm (step by step, in your own words).
Then we'll discuss it.
If it's correct, you'll write the code.
I'll only give hints if you get stuck. */