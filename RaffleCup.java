
import java.util.Random;

public class raffleCup  {   
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
  
   }
}
 
 