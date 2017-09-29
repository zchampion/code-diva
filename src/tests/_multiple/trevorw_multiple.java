package tests._multiple;
import java.util.ArrayList;
/*
 William Whitecar
 Multiple Errors
 Missing Blank line @ lines 10 and 14
 Incorrect Casing @ lines 9, 15, and 29
 */

public class trevorw_multiple
{
   private static ArrayList<Integer> listy = new ArrayList<>();

   public String helloWorld( String name) {
      return "Hello World and " + name;
   }
   public static void LoopListy( int  numberOfLoops) {
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
   
   public static void ArithmeticOnListy() {
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
