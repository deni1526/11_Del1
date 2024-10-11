class Player {
    //attributes
    private String name;
    private int points;

    
    Player() {
        this.name = "player1";
        this.points = 0;
    }

    //constructor
    Player (String name, int points) {
        this.name = name;
        this.points = points;
    }


    //methods
    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }



    int getPoints() {
        return this.points;
    }

    void setPoints(int points) {
        this.points = points;
    }

    void addPoints(int die1, int die2) {
        this.points += die1 + die2;
    }





    
}
