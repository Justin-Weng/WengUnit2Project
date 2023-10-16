public class LinearEquation {
    double slope;
    double yIntercept;
    double distanceBetweenPoints;
    String firstCoord;
    String secondCoord;
    public LinearEquation(int firstX, int firstY, int secondX, int secondY) {
        slope = (double) (secondY-firstY) / (secondX-firstX);
        yIntercept = firstY - (firstX * slope);
        distanceBetweenPoints = Math.sqrt(Math.pow(secondX-firstX, 2) + Math.pow(secondY - firstY, 2));
        firstCoord = "(" + firstX + ", " + firstY + ")";
        secondCoord = "(" + secondX + ", " + secondY + ")";
    }

    public String lineInfo() {
        return "The 2 points are: " + firstCoord + " and " + secondCoord + "\nThe equation of the line between these points is: y = " + slope + "x" + " + " + yIntercept + "\nThe slope of this line is: " + slope + "\nThe y-intercept of this line is: " + yIntercept + "\nThe distance between these points is " + distanceBetweenPoints;
    }
}
