public class Arryevenandodd {
    public static void main(String[] args) {
        
    
    int[] arr = {12, 7, 9, 18, 20, 5};
    int evencount=0;    
    int oddCount=0;
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2==0)
        {
        evencount++;
        }
        else
        {
       oddCount++;
            
        }
    }
    System.out.println("the event count is : " + evencount);
    System.out.println("the oddcount is : "+ oddCount);
    }
}
/*
(Difficulty: 6.5/10)

Now let's move to one of the most common interview questions.

Problem #16 – Count Even and Odd Numbers in an Array

Given:

int[] arr = {12, 7, 9, 18, 20, 5};

Expected output:

Even numbers = 3
Odd numbers = 3
Rules
Use one for loop.
Do not use nested loops.
Create two variables:
evenCount
oddCount

This problem combines everything you've learned:

Arrays
Loops
Modulus operator (%)
if-else */