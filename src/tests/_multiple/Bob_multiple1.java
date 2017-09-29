/*
	Dong(Bob) Lee
	09/10/17
	Test program that does not follow the indentation convention, and brace alignment convention.
*/
package tests._multiple;
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

class Bob_multiple1 {

   static Scanner input = new Scanner(System.in);
   
   static DecimalFormat formatter = new DecimalFormat("##.###");

   private static void explanation(){
   
      System.out.println("This program will use method" +
                        " in order to upgrade the assignment 2" + " I am Bob.");
   }

   private static double value(){
   
      Scanner input = new Scanner(System.in);
   
      double chamber = input.nextDouble();
      
      if(chamber <= 0){
      
         System.out.println("Please input a number that is " +
                           "greater than zero.");
         
         value();
      
      }
      
      return chamber; 
   
   }
   
   public static double calc(double gross_pay, double per_rate){
   
      double saved = gross_pay * per_rate;
      return saved;
   }

   public static void lastly(double sav_amt, double sav_IRA_amt)
   {
   
   System.out.println(sav_amt + " " + "Here is the total amount from savings rate.");
      
      System.out.println(sav_IRA_amt + " " + "Here is the total amount from IRA savings.");
      
      String chamber = formatter.format(sav_IRA_amt);
      
      double IRA_sav = Double.parseDouble(chamber);      
      chamber = formatter.format(sav_amt);      
      double savings_amt = Double.parseDouble(chamber);      
      double lastly = savings_amt + IRA_sav;      
      System.out.println(lastly + " " + "Here is the total amount that was saved.");   
	}

   public static void main(String args[])
   {   
explanation();         System.out.println("Please, input the number for gross pay.");   
double gross_pay = value();            System.out.println("Please, input the number for savings rate.");      
      double savings_rate = value();      
      System.out.println("Please, input the number for IRA rate.");      
      double IRA_rate = value();      
      double sav_amt = calc(gross_pay, savings_rate);      
      double sav_IRA_amt = calc(gross_pay, IRA_rate);      
      lastly(sav_amt, sav_IRA_amt);      
   }
}