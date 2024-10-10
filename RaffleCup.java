

public class raffleCup  {   
   
   private int die1;
   private int die2;
   private int sum; 

   int getDie1() {
       return this.die1;
   }
   int getDie2() {
      return this.die2;
   }
   void shakeRaffle() {
      rollDice();
      this.die1 = getDie();
      rollDice();
      this.die2 = getDie();
   
   }

   void sum() {
      this.sum = this.die1 + this.die2;
   }
   void getSum() {
      return this.sum;
   }
   
   boolean getEns() {
      if (this.die1 == this.die2) {
         return true;
      } else {
         return false;
      }
   }
   
   }


/*
      public static void main(String[] args) {
Random rand = new Random();
int max=6,min=1;
    
     int p = 0; 
    var point = p;

    
    while (p < 40) {

        var d1 = rand.nextInt(max - min + 1) + min;
        var d2 = rand.nextInt(max - min + 1) + min;
        var sum = d1 + d2;
        p = p + sum;

    }
    System.out.println(p);

    */
   