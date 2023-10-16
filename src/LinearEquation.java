public class LinearEquation {
    String slope;
    double yIntercept;
    double distanceBetweenPoints;
    String firstCoord;
    String secondCoord;
    public LinearEquation(int firstX, int firstY, int secondX, int secondY) {
        double tempSlope = (double) (secondY-firstY) / (secondX-firstX);
        if (tempSlope == (double) ((secondY-firstY) / (secondX-firstX))) {
            slope = Integer.toString((secondY-firstY) / (secondX-firstX));
        } else {
            slope = (secondY-firstY) + "/" + (secondX-firstX);
        }
        yIntercept = firstY - (firstX * tempSlope);
        distanceBetweenPoints = Math.sqrt(Math.pow(secondX-firstX, 2) + Math.pow(secondY - firstY, 2));
        firstCoord = "(" + firstX + ", " + firstY + ")";
        secondCoord = "(" + secondX + ", " + secondY + ")";
    }

    public String lineInfo() {
        String returnString = "The 2 points are: " + firstCoord + " and " + secondCoord + "\nThe equation of the line between these points is: y = ";
        if (!slope.equals("1")) {
            returnString += slope;
        }
        returnString += "x" + " + " + yIntercept + "\nThe slope of this line is: " + slope + "\nThe y-intercept of this line is: " + yIntercept + "\nThe distance between these points is " + distanceBetweenPoints;
        return returnString;
    }
}
