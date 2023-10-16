import java.util.Scanner;

public class LinearEquationLogic {
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
    }

    public void start() {
        System.out.println("Welcome to the Linear equation calculator!");
        getCoordinateInputs();
        calculateXAndY();
        LinearEquation equation = new LinearEquation(firstX, firstY, secondX, secondY);
        System.out.println(equation.lineInfo());
    }

    private void getCoordinateInputs() {
        System.out.print("Enter your first coordinate point: ");
        firstCoord = scan.nextLine();
        System.out.print("Enter your second coordinate point: ");
        secondCoord = scan.nextLine();
    }

    private void calculateXAndY() {
        int firstCommaIndex = firstCoord.indexOf(",");
        firstX = Integer.parseInt(firstCoord.substring(1, firstCommaIndex));
        firstY = Integer.parseInt(firstCoord.substring(firstCommaIndex + 2, firstCoord.length() - 1));
        int secondCommaIndex = secondCoord.indexOf(",");
        secondX = Integer.parseInt(secondCoord.substring(1, secondCommaIndex));
        secondY = Integer.parseInt(secondCoord.substring(secondCommaIndex + 2, secondCoord.length() - 1));
    }
}
