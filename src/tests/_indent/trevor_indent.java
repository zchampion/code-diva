package tests._indent;

import java.util.ArrayList;

/*
 Trevor Whitecar
 Block Indentation
 4 errors should be found in this file at lines 13, 20, 26, and 34
 */

public class trevor_indent {

   private static ArrayList<Integer> listy = new ArrayList<>();

public String helloWorld( String name) {
   return "Hello World and " + name;
}

   public static void loopListy( int  numberOfLoops) {
      if ( numberOfLoops == 0 || numberOfLoops <= 0)
      {
      System.out.println( "No loops to be done!!");
      } 
      else 
      {
         for ( int i = 0; i <= numberOfLoops; i++)
         {
         listy.add(i);
         }
      }
   }

   public static void arithmeticOnListy() {
      int solution = 0;
      int counter = 0;
   while ( counter < listy.size() && !listy.isEmpty())
   {
         solution = listy.get(counter);
         solution = solution + 15;
         solution = solution * 5;
         solution = solution / 5;
         solution = solution - 15;
         solution++;
         solution--;
   }
   }
}
