/*
ThienNgo Nguyen Le
Error type(s): multiple
There is an optional braces errors on line 29, indentation errors line 13, 32, 33
*/
import java.util.Scanner;

public class ThienNgo_multiple2 {
   
   public static void main (String[]args) {
      
      Scanner console = new Scanner(System.in);
    double num1, num2; 
      double average;    
      
      System.out.println("This program averages two real numbers.");
      
      System.out.print("Input your first number: ");
      num1 = console.nextDouble();
      System.out.print("Input your second number: ");
      num2 = console.nextDouble();
      
      average = (num1+ num2) /2.0;
      
      System.out.print(" The average of " + num1);
      System.out.println(" and " + num2 + " is " + average);
      System.out.println(" ThienNgo N. Le");
      
      if(average >= 10)
          System.out.print(" The average is large ");
      
console.close();
System.exit(0);
   } 
} 