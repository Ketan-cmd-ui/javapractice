public class SimpleCalculator {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        char operator='+';
        int result;
     
        if (operator == '*') {
            System.out.println("the multiplication is :"+ num1 * num2 );
        }
        else if (operator == '+') {
            System.out.println("the addition is :" +( num1 + num2));
        }
        else if (operator == '-') {
           result = num1- num2;
           System.out.println("the subtraction is : " + result);
        }
        else if (operator == '/') {
             System.out.println("the divison  is :" + num1 / num2);
        }
       else if (operator == '%')
       {
           System.out.println("the moudlus is :" + num1 % num2);
       }
       else  
       {
        System.out.println("invalid opreator");
       }
    }
}
/*Problem #10 – Simple Calculator

Write a Java program with:

int num1 = 20;
int num2 = 10;
char operator = '*';

Perform the operation based on the operator:

'+' → Addition
'-' → Subtraction
'*' → Multiplication
'/' → Division
'%' → Modulus

If the operator is invalid, print:

Invalid Operator
Rules
Use only if-else if-else (don't use switch yet).
Handle division carefully (assume num2 is not zero for now). */