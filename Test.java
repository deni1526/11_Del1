class Test {
    public static void main(String args[]) {
        var die1 = new Dice();
        var die2 = new Dice();

        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        int c7 = 0;
        int c8 = 0;
        int c9 = 0;
        int c10 = 0;
        int c11 = 0;
        int c12 = 0;

        for (var i = 0; i < 1000; i++) {
            raffleCup.shakeRaffle(die1, die2);
            
            switch (Utils.getSumDice(die1, die2)) {
                case 2 -> c2++;
                case 3 -> c3++;
                case 4 -> c4++;
                case 5 -> c5++;
                case 6 -> c6++;
                case 7 -> c7++;
                case 8 -> c8++;
                case 9 -> c9++;
                case 10 -> c10++;
                case 11 -> c11++;
                case 12 -> c12++;
            }
        
        
        }
        System.out.println("Number of 2's " + c2);
        System.out.println("Number of 3's " + c3);
        System.out.println("Number of 4's " + c4);
        System.out.println("Number of 5's " + c5);
        System.out.println("Number of 6's " + c6);
        System.out.println("Number of 7's " + c7);
        System.out.println("Number of 8's " + c8);
        System.out.println("Number of 9's " + c9);
        System.out.println("Number of 10's " + c10);
        System.out.println("Number of 11's " + c11);
        System.out.println("Number of 12's " + c12);
    }
}