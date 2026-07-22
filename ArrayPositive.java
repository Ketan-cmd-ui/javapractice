public class ArrayPositive {
    public static void main(String[] args) {
       int[] arr = {12, -7, 0, 18, -20, 5, 0};
       int positiveCount=0;
       int negativeCount=0;
       int zeroCount=0;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]>0)
        {
            positiveCount++;
        }
        else if(arr[i]<0)
        {
            negativeCount++;
        }
        else if(arr[i]==0)
        {
            zeroCount++; }
       }
       System.out.println(positiveCount +  " : the positive count ");
       System.out.println(negativeCount + " : the negative count  ");
       System.out.println(zeroCount+ " : zero count ");
    }
}
/*
Now we'll combine comparison and counting.

Problem #18 – Count Positive, Negative, and Zero Elements

Given:

int[] arr = {12, -7, 0, 18, -20, 5, 0};

Expected output:

Positive = 3
Negative = 2
Zero = 2
Rules
Use one for loop.
Create three variables:
positiveCount
negativeCount
zeroCount
Do not use nested loops.

This is a very common array interview question. Try solving it on your own before asking for hints. */