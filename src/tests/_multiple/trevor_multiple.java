import java.util.ArrayList;

/*
  William Whitecar
  Multiple Errors
  Operation Errors at lines: 32, 35
  Brace Alignment at lines: 22, 23
  Optional Brace at lines: 19
 */

public class trevor_multiple {

   private static ArrayList<Integer> listy = new ArrayList<>();

   public String helloWorld( String name) {
      return "Hello World and " + name;
   }

   public static void loopListy( int  numberOfLoops) {
      if ( numberOfLoops == 0 || numberOfLoops <= 0)
         System.out.println( "No loops to be done!!");
      else {
         for ( int i = 0; i <= numberOfLoops; i++) {
            listy.add(i);
         }
      }
   }

   public static void arithmeticOnListy() {
      int solution = 0;
      int counter = 0;
      while ( counter < listy.size() && !listy.isEmpty()) {
         solution = listy.get(counter);
         solution = solution +15;
         solution = solution * 5;
         solution = solution / 5;
         solution = solution- 15;
         solution++;
         solution--;
      }
   }
}
