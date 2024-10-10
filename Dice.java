 import java.util.Random;
class Dice {
    private int die;

        Dice {
           
            Random rand = new Random();
        int max=6,min=1; 
        this.die = rand.nextInt(max - min + 1) + min;

    }

    void SetDie(int die) {
        this.die = die;
    }

    int GetDie() {
        return this.die;
    }
}

