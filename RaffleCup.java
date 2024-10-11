import java.util.Random;

class RaffleCup  {   
   
   //methods
   static void shakeRaffle(Dice die1, Dice die2) {
      Random rand = new Random();
      int max=6,min=1; 
      int d1 = rand.nextInt(max - min + 1) + min;
      int d2 = rand.nextInt(max - min + 1) + min;

      die1.setDie(d1);
      die2.setDie(d2);
        
   }
}


   



