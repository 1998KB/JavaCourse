package Chapter4;

import java.util.Random;

public class RollTheDieGame {

   public static void main(String[] arg) {

      int boardSpace = 0;
      int spacesLeft = 20;
      int boardSpacesTotal = 20;
      int rolls = 0;

      do {
         Random random = new Random();
         int die = random.nextInt(6) + 1;
         rolls += 1;
         boardSpace += die;
         spacesLeft -= die;

         if(boardSpace == 20) {
            System.out.println("Roll #" + rolls + ": You've rolled a " + die + ". You are now on " + boardSpace + ". Congrats, you win!");
            break;
         }
         else if(boardSpace > boardSpacesTotal){
            System.out.println("Roll #" + rolls + ": You've rolled a " + die + ". You lost!");
            break;
         }
         else if (rolls == 5){
            System.out.println("Roll #" + rolls + ": You've rolled a " + die + ". You are now on " + boardSpace + ". You lost!");
         }
         else {
            System.out.println("Roll #" + rolls + ": You've rolled a " + die + ". You are now on " + boardSpace + " and you have " + spacesLeft + " more to go.");
         }
      } while (rolls < 5);
   }
}
