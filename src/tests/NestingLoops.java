package tests;

/*
* Testing for "blank line" style errors
* Errors on lines:
* 30 - Missing blank line between methods
* 44 - Missing blank line at end of file
*/

import java.util.Scanner;

public class NestingLoops
{
   public static void main(String[] args)
   {
      Scanner GetChoice = new Scanner(System.in);

      System.out.print("How many rows do you want? ");
      int Rows = GetChoice.nextInt();

      System.out.print("How many columns do you want? ");
      int Columns = GetChoice.nextInt();
      System.out.println();

      print_header(Columns);

      print_grid(Rows, Columns);
   }
   private static void print_header(int columns) {
      for (int ColNum = 1; ColNum <= columns; ColNum++)
         System.out.print("\t" + ColNum);

      System.out.println();
   }

   private static void print_grid(int rows, int columns) {
      for (int Row = 1; Row <= rows; Row++)
      {
         System.out.print(Row + "\t");

         for (int Column = 1; Column <= columns; Column++)
         {
            System.out.print(Row * Column + "\t");
         }
         System.out.println();
      }
   }
}