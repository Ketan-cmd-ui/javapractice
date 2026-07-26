public class Arrlargestloop {
    public static void main(String[] args) {
        int [] arr ={12,45,7,10,23};
      
    int largest=arr[0];
    int Secondlargest=arr[0];
  
        for(int i=0;i<arr.length;i++)
        {
         
         if (arr[i]>largest ) {
            Secondlargest=largest;
           largest=arr[i];
          
           }
           else if(arr[i] >Secondlargest)
           {
            Secondlargest=arr[i];
           }
         } 
        
        
        System.out.println("the largest " +  largest);
         System.out.println("the secondlargest " +  Secondlargest);
    }
}


/*
Find the Largest Number in an Array
int[] arr = {12, 45, 7, 89, 23};

Expected output:

Largest = 89
Rules
Use a for loop.
Do not sort the array.
Do not use library methods like Arrays.sort() or Collections.max(). */