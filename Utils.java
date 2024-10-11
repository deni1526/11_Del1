 class Utils{

   static boolean getEns(Dice die1, Dice die2) {
      if (die1.getDie() == die2.getDie()) {
         return true;
      } else {
         return false;
      }
   }

   static void printDiceValues(Dice die1, Dice die2) {
      System.out.println(die1.getDie() + " " + die2.getDie());
   }

   static void printPlayerPoints(Player player) {
      System.out.println(player.getName() + " has " + player.getPoints() + " points");
   }
 }
