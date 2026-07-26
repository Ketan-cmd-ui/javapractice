public class ArrayIntersection {
    public static void main(String[] args) {
       int[] arr1 = {1, 2, 3, 4, 5};
       int[] arr2 = {3, 4, 5, 6, 7}; 
       
       for(int i=0;i<arr1.length;i++)
       {
        for(int j=0;j<arr2.length;j++)
        {
            if(arr1[i]==arr2[j])
            {
               System.out.println(arr2[j]);
            }
        }
       }
       
    }
}
/*
Challenge Problem #20: Intersection of Two Arrays
Problem

Given two arrays, print the common elements.

Input
int[] arr1 = {1, 2, 3, 4, 5};
int[] arr2 = {3, 4, 5, 6, 7};
Expected Output
3
4
5 */