package tests._multiple;

/**
 * This is a test file with optional curly braces and missing blank line errors.
 * Optional curly braces errors: line 74 and line 103
 * Missing blank line errors: line 37 and line 50
 */

import java.util.Objects;

public class Jeff_multiple1
{
   private final int WHY_NOT_CAPITAL = 0;
   private final String GAME_ID;
   private final String HOME_TEAM_ID;
   private final String GUEST_TEAM_ID; 
   private final String GAME_DATE;
   private final String HOME_TEAM_SCORE;
   private final String GUEST_TEAM_SCORE;
  
   public Jeff_multiple1(String GAME_ID, String HOME_TEAM_ID,
                         String GUEST_TEAM_ID, String GAME_DATE, String HOME_TEAM_SCORE,
                         String GUEST_TEAM_SCORE)
   {
      this.GAME_ID = GAME_ID; 
      this.HOME_TEAM_ID = HOME_TEAM_ID;
      this.GUEST_TEAM_ID = GUEST_TEAM_ID;
      this.GAME_DATE = GAME_DATE;
      this.HOME_TEAM_SCORE = HOME_TEAM_SCORE;
      this.GUEST_TEAM_SCORE = GUEST_TEAM_SCORE;
   }
        
   public String GetGameId() 
   {  
      return GAME_ID;
   } 
   public String getHomeTeamId() 
   { 
      return HOME_TEAM_ID;
   }

   public String getGuestTeamId()
   {     
      return GUEST_TEAM_ID;
   }
    
   public String getGameDate()
   {  
      return GAME_DATE;
   }
   public String getHomeTeamScore()
   {
      return HOME_TEAM_SCORE;
   }
    
   public String getGuestTeamScore()
   {        
      return GUEST_TEAM_SCORE;  
   }

   @Override
   public String toString()
   {
      return "Game{" + "GAME_ID = " + GAME_ID + ", HOME_TEAM_ID = "
            + HOME_TEAM_ID + ", GUEST_TEAM_ID = " + GUEST_TEAM_ID
            + ", GAME_DATE = " + GAME_DATE + ", HOME_TEAM_SCORE = "
            + HOME_TEAM_SCORE + ", GUEST_TEAM_SCORE = " + GUEST_TEAM_SCORE
            + '}';
   }

   @Override
   public boolean equals(Object obj)
   {
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
      {
         return false;
      }

      final Jeff_multiple1 other = (Jeff_multiple1) obj;

      if (!Objects.equals(this.GAME_ID, other.GAME_ID))
      {
         return false;
      }
      if (!Objects.equals(this.HOME_TEAM_ID, other.HOME_TEAM_ID))
      {
         return false;
      }
      if (!Objects.equals(this.GUEST_TEAM_ID, other.GUEST_TEAM_ID))
      {
         return false;
      }
      if (!Objects.equals(this.GAME_DATE, other.GAME_DATE))
      {
         return false;
      }
      if (!Objects.equals(this.HOME_TEAM_SCORE, other.HOME_TEAM_SCORE))
      {
         return false;
      }
      if (!Objects.equals(this.GUEST_TEAM_SCORE, other.GUEST_TEAM_SCORE))
         return false;
   return true;
   }
}

