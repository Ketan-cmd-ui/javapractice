public class ArrayMaxEvenNumber {
    public static void main(String[] args) {
      int[] arr = {12, 50, 22, 8};
       int maxeven=arr[0];
       int evennumber=arr[0];
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]%2==0 && arr[i]>maxeven)
        {
         maxeven=arr[i];
        } 
       
    
       }
      System.out.println(maxeven);
    }
}
/* 23 – Find the Maximum Even Number (Difficulty: 8.5/10)

Given:

int[] arr = {12, 45, 8, 89, 22, 50, 7};

Expected Output:

Maximum Even Number = 50
Rules
Use one for loop.
Do not sort the array.
Do not use any built-in methods.
You need to combine two concepts:
Check if a number is even.
Compare it with the current maximum.

Give it a try. This problem combines the "largest element" pattern with the "even number" check you've already mastered.*/