class pointGame{
    public static void main(String args[]) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        //create variables
        var Player1 = new Player();
        var Player2 = new Player();
        var die1 = new Dice();
        var die2 = new Dice();
        String sInput = "";
        String playername = "";
        var player = new Player[2];
        player[0] = Player1;
        player[1] = Player2;
        int count = 0;
        
        //set player names
        System.out.println("Spiller 1 indstast navn");
        playername = scanner.nextLine();
        player[0].setName(playername);

        System.out.println("Spiller 2 indstast navn");
        playername = scanner.nextLine();
        player[1].setName(playername);
        

        
        
        //play dice game
        while(player[0].getPoints() < 40 && player[1].getPoints() < 40) {
            sInput = scanner.nextLine(); //input so players must press enter to roll
            System.out.println(player[count].getName() + "'s turn");
            RaffleCup.shakeRaffle(die1, die2);
            Utils.printDiceValues(die1, die2);
            player[count].addPoints(die1.getDie(), die2.getDie());
            Utils.printPlayerPoints(player[count]);            
            if(Utils.getEns(die1, die2) == false) { //switch player if they don't get a double
                count = (count+1) % 2;
            }
        }
        scanner.close();


    }
}
