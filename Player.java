class Player {
    String name;
    int points;


    Player (String name, int points) {
        this.name = name;
        this.points = points;
    }



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

    void sumPoints(int point) {
        this.points += point;
    }





    
}
