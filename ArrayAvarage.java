public class ArrayAvarage {
    public static void main(String[] args) {
     int sum=0;
     double average=0;
    int[] arr = {10, 20, 30, 40, 50};
    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
        
    }
    
    System.out.println("the sum is : " + sum);
    average = (double) sum / arr.length;
System.out.println("the avarage is : " +average);
    }
}
/*
Problem #22 – Find the Average of Array Elements
Problem Statement

Given:

int[] arr = {10, 20, 30, 40, 50};

Print the average of all elements.

Expected Output
Sum = 150
Average = 30.0
Rules
✅ Use only one for loop.
✅ Do not use any built-in methods.
✅ Create a variable named sum.
✅ Calculate the average using the formula:

 */