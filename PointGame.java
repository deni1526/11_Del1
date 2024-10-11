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

        
        var die1 = new Dice();
        var die2 = new Dice();
        String sInput = "";

        while(player[0].getPoints() < 40 || player[1].getPoints() < 40) {
            sInput = scanner.nextLine();
            System.out.println(player[count].getName() + "'s turn");
            raffleCup.shakeRaffle(die1, die2);
            Utils.printDiceValues(die2, die2);
            player[count].addPoints(die1.getDie(), die2.getDie());
            Utils.printPlayerPoints(player[count]);            
            if(Utils.getEns(die1, die2) == false) {
                count = (count+1) % 2;
            }
        }
        scanner.close();


    }
}
