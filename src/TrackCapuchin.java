public class TrackCapuchin {

    private int xcoordCurrent;
    private int ycoordCurrent;
    private int xcoordGoal;
    private int ycoordGoal;

    public TrackCapuchin (int xGoal, int yGoal) {
        xcoordCurrent = 0;
        ycoordCurrent = 0;
        xcoordGoal = xGoal;
        ycoordGoal = yGoal;
    }

    public int getXcoordCurrent() {
        return xcoordCurrent;
    }
    public int getYcoordCurrent() {
        return ycoordCurrent;
    }

    public int getXcoordGoal() {
        return xcoordGoal;
    }
    public int getYcoordGoal() {
        return ycoordGoal;
    }

    public void moveMonkey (int xChange, int yChange) {
        xcoordCurrent += xChange;
        ycoordCurrent += yChange;
    }

    public double calcFoodDistance () {
        double changeInX = Math.pow(xcoordGoal,2) - Math.pow(xcoordCurrent,2);
        double changeInY = Math.pow(ycoordGoal,2) - Math.pow(ycoordCurrent,2);
        return Math.sqrt(changeInX+changeInY);
    }

    public boolean isCloserThan (TrackCapuchin other) {
        return this.calcFoodDistance() < other.calcFoodDistance();
    }
}
