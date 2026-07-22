public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 18, 20, 5};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
              
        }
        
        System.out.println(sum);
    }
}


/*
(Difficulty: 7/10)

This is another classic interview question.

Problem #17 – Find the Sum of All Elements in an Array

Given:

int[] arr = {12, 7, 9, 18, 20, 5};

Expected output:

Sum = 71
Rules
Use one for loop.
Do not use any built-in methods.
Use a variable named sum. */