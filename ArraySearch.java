public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};
        int target = 89;
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]==target)
            {
             System.out.println("the element found at index : " + i);
             found=true; 
             break;
            }
       
        }
         if(!found)
        {
             System.out.println("not found");
             
        }
        
    
 
    }
}
/*

(Difficulty: 8/10)

This is another classic interview question.

Problem #21 – Search an Element in an Array

Given:

int[] arr = {12, 45, 7, 89, 23};
int target = 89;

Expected output:

Element found at index 3

If the element doesn't exist:

Element not found
Rules
Use one for loop.
Do not use built-in methods.
Create a variable to remember whether the element was found.

💡 This introduces a very important interview concept: using a flag variable (typically a boolean) to remember whether something has been found. Try solving it on your own first.
 */