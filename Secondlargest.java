public class Secondlargest {
    public static void main(String[] args) {

        int a = 100;
        int b = 40;
        int c = 30;

        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            System.out.println("a is the second largest");
        }
        else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            System.out.println("b is the second largest");
        }
        else {
            System.out.println("c is the second largest");
        }
    }
}
/*  c=10 , a=20 , b=30
b=10 , a=20 , c=30
a >=c && a <=b

b a c
a>=b && a<=c
*/
