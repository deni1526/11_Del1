class pointGame{
    public static void main(String args[]) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var player = new Player[2];
        String playername = "";
        System.out.println("Spiller 1 indstast navn");
        playername = scanner.nextLine();
        player[0].setName(playername);
        System.out.println("Spiller 2 indstast navn");
        playername = scanner.nextLine();
        player[1].setName(playername);
        int count = 0;

        var cup = new raffleCup();
        var die1 = new Dice();
        var die2 = new Dice();

        while(player[0].getPoints() < 40 || player[1].getPoints() < 40) {
            cup.shakeRaffle();
            //Printvalues method will be called here once the utils class has been made
            player[count].addPoints(die1.getDie(), die2.getDie());
            //printPoints method will be called here once the utils class has been made
            
            if(cup.getEns() == false) {
                count = count+1 % 2;
            }
        }
        scanner.close();


    }
}
