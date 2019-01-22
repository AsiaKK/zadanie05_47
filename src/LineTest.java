import java.util.Scanner;

public class LineTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj x1: ");
        double x1 = scan.nextDouble();
        System.out.println("podaj y1: ");
        double y1 = scan.nextDouble();
        System.out.println("poday x2: ");
        double x2 = scan.nextDouble();
        System.out.println("podaj y2: ");
        double y2 = scan.nextDouble();
        System.out.println("podaj x3: ");
        double x3 = scan.nextDouble();
        System.out.println("podaj y3: ");
        double y3 = scan.nextDouble();
        System.out.println("poday x4: ");
        double x4 = scan.nextDouble();
        System.out.println("podaj y4: ");
        double y4 = scan.nextDouble();
        scan.close();

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);
        Point point4 = new Point(x4, y4);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);

        System.out.println("Two lines have been created");
        System.out.println("Line first: " + line1);
        System.out.println("Line second: " + line2);

        LineChecker lineChecker = new LineChecker();
        Line result = lineChecker.getLonger(line1, line2);

        System.out.println("Longer line is: " + result);
    }
}
