public class ElectricitBill {
 public static void main(String[] args) {
    int units=101;
    if(units <=100 && units >= 0) 
    {
        System.out.println("the bill : "+ units*5);
    }
    else if(units >=101 && units <=200) 
    {
        System.out.println("the bill is :" +units *7);
    }
    else {
        System.out.println("the bill is :"+ units*10);
    }
 }   
}
/*

Problem #7 – Electricity Bill Calculator

Difficulty: ⭐⭐⭐⭐⭐⭐☆☆☆☆ (6/10)

Problem Statement

Write a Java program to calculate the electricity bill based on these rules:

Units Consumed	Rate per Unit
0 – 100	₹5
101 – 200	₹7
Above 200	₹10
*/