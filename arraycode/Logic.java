public class Logic {
    public static void main(String[] args) {
        int marks=82;

        if(marks>=90)
        {
            System.out.println("grade A");
        }
        else if (marks>=75) {
            System.out.println("grade B");
        }
        else if (marks>=60) {
          System.out.println("grade C");            
        }
        else if(marks>=40)
        {
            System.out.println("grade D");
        }
        else{
            System.out.println("fail");
        }
    }
}
