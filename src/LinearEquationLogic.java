import java.util.Scanner;

public class LinearEquationLogic {
    private LinearEquation equation;
    private Scanner scan;
    private String firstCoord;
    private String secondCoord;
    private int firstX;
    private int firstY;
    private int secondX;
    private int secondY;

    public LinearEquationLogic() {
        scan = new Scanner(System.in);
        firstCoord = null;
        secondCoord = null;
        equation = null;
    }

    public void start() {
        initialSetUp();
        equation = new LinearEquation(firstX, firstY, secondX, secondY);
        System.out.println(equation.lineInfo());
        calculateYfromX();
    }

    private void initialSetUp() {
        boolean continueLoop = true;
        System.out.println("Welcome to the Linear equation calculator!");
        while (continueLoop) {
            System.out.print("Enter your first coordinate point: ");
            firstCoord = scan.nextLine();
            System.out.print("Enter your second coordinate point: ");
            secondCoord = scan.nextLine();

            int firstCommaIndex = firstCoord.indexOf(",");
            firstX = Integer.parseInt(firstCoord.substring(1, firstCommaIndex));
            firstY = Integer.parseInt(firstCoord.substring(firstCommaIndex + 2, firstCoord.length() - 1));
            int secondCommaIndex = secondCoord.indexOf(",");
            secondX = Integer.parseInt(secondCoord.substring(1, secondCommaIndex));
            secondY = Integer.parseInt(secondCoord.substring(secondCommaIndex + 2, secondCoord.length() - 1));

            if (firstX == secondX) {
                if (firstY == secondY) {
                    System.out.println("A line requires 2 points to be drawn. The points given are the same so a line is unable to be drawn. Try again using different points.");
                } else {
                    System.out.println("This is not a function as the 2 x values have different y values. Try again using different points.");
                }
            } else {
                continueLoop = false;
            }
        }
    }
    public void calculateYfromX() {
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.print("Enter an x value: ");
            double x = scan.nextDouble();
            scan.nextLine();
            System.out.println("Your new coordinate is: (" + x + ", " + equation.coordinateForX(x) + ")");
            System.out.print("Would you like to get another coordinate point? (\"n\" to stop): ");
            if (scan.nextLine().equals("n")) {
                continueLoop = false;
            }
        }
    }
}
