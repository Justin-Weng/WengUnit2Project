public class LinearEquation {
    private String slopeString;
    private String firstCoord;
    private String secondCoord;
    private int firstX;
    private int firstY;
    private int secondX;
    private int secondY;
    public LinearEquation(int firstX, int firstY, int secondX, int secondY) {
        firstCoord = "(" + firstX + ", " + firstY + ")";
        secondCoord = "(" + secondX + ", " + secondY + ")";
        this.firstX = firstX;
        this.firstY = firstY;
        this.secondX = secondX;
        this.secondY = secondY;
        if (slope() == (int) slope()) {
            slopeString = Integer.toString((secondY-firstY) / (secondX-firstX));
        } else {
            boolean isPositive = true;
            if ((secondY-firstY) < 0) {
                isPositive = !isPositive;
            }
            if ((secondX-firstX) < 0) {
                isPositive = !isPositive;
            }
            slopeString = Math.abs((secondY-firstY)) + "/" + Math.abs((secondX-firstX));
            if (!isPositive) {
                slopeString = "-" + slopeString;
            }
        }
    }

    public double Distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(secondX-firstX, 2) + Math.pow(secondY - firstY, 2)));
    }

    public double yIntercept() {
        return firstY - (firstX * slope());
    }

    public double slope() {
        return (double) (secondY - firstY) / (secondX - firstX);
    }

    public String equation() {
        String stringToReturn = "y = ";
        if (slope() == 1.0) {
            stringToReturn += "x + " + yIntercept();
        } else if (slope() == 0.0) {
            stringToReturn += yIntercept();
        } else if (slope() == -1.0) {
            stringToReturn += "-x + " + yIntercept();
        } else {
            stringToReturn += slopeString + "x + " + yIntercept();
        }
        return stringToReturn;
    }

    public String lineInfo() {
        return "The 2 points are: " + firstCoord + " and " + secondCoord + "\nThe equation of the line between these points is: " + equation()+ "\nThe slope of this line is: " + slope() + "\nThe y-intercept of this line is: " + yIntercept() + "\nThe distance between these points is " + Distance();
    }

    public double coordinateForX(double x) {
        return slope() * x + yIntercept();
    }

    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
}