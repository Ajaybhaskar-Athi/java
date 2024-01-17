// import java.util.Scanner;

// public class e {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input the first number
//         System.out.print("Enter the first number: ");
//         double num1 = scanner.nextDouble();

//         // Input the operation (+, -, *, /)
//         System.out.print("Enter the operation (+, -, *, /): ");
//         char operator = scanner.next().charAt(0);

//         // Input the second number
//         System.out.print("Enter the second number: ");
//         double num2 = scanner.nextDouble();

//         double result;

//         // Perform the calculation based on the operator
//         switch (operator) {
//             case '+':
//                 result = num1 + num2;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 if (num2 != 0) {
//                     result = num1 / num2;
//                 } else {
//                     System.out.println("Error: Cannot divide by zero.");
//                     return;
//                 }
//                 break;
//             default:
//                 System.out.println("Error: Invalid operator.");
//                 return;
//         }

//         // Display the result
//         System.out.println("Result: " + result);

//         // Close the scanner
//         scanner.close();
//     }
// }

import java.util.*;
public class e{
    public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a,b;
System.out.println("enter tgghe first number");
a=s.nextInt();
System.out.println("enter the operation you want to perform (+,*,-,/)");
char op=s.next().charAt(0);
System.out.println("enter tyhe second number");
int res=0;
b=s.nextInt();
switch(op){
    case '+':
    res=a+b;
    break;
    case '-':
    res=a-b;
    break;
    case '*':
    res=a*b;
    break;
    case '/':
    if(b!=0){
    res=a/b;
    }
    else System.out.println("enter a positive second number");
    break;
    default:
    System.out.println("enter valid operation");
}
System.out.println("the result got is : " + res);
s.close();
    }
}