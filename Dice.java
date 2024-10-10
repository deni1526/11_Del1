 import java.util.Random;
class Dice {
    private int die;

        static void rollDice() { 
        Random rand = new Random();
        int max=6,min=1; 
        this.die = rand.nextInt(max - min + 1) + min;

    }

    void setDie(int die) {
        this.die = die;
    }

    int getDie() {
        return this.die;
    }
}

