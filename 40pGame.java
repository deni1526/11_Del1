class pointGame{
    public static void main(String args[]) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var player = new Player[2];
        System.out.println("Spiller 1 indstast navn");
        player[0].setName(scanner.nextString());
        System.out.println("Spiller 2 indstast navn");
        player[1].setName(scanner.nextString());
        int count = 0;

        while(player[0].points < 40 || player[1].points < 40) {}


    }
}
