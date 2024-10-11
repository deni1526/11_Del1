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

        while(player[0].getPoints() < 40 || player[1].getPoints() < 40) {
            cup.shakeRaffle();
            //Printvalues method will be called here once the utils class has been made
            cup.sum();
            player[count].addPoints(cup.getSum()); //giver ikke mening at kalde summen før den bruges
            //printPoints method will be called here once the utils class has been made
            
            if(cup.getEns() == false) { //count ændrer sig kun når facevalues ikke er ens men med count ved vi ikke om den er 0 eller 1
                if(count == 0) {
                    count = 1;
                } else {
                    count = 0;
                }
            }
        }


    }
}
