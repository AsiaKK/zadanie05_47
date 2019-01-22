public class LineChecker {

    public Line getLonger(Line line1, Line line2){
        double firstLenght = line1.getLenght();
        double secondLenght = line2.getLenght();

        if (firstLenght > secondLenght){
            return line1;
        } else {
            return line2;
        }
    }
}
