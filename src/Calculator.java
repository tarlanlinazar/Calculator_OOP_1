import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    private int numbOne;
    private int numbTwo;

    public Calculator(int numbOne, int numbTwo) {
        this.numbOne = numbOne < Integer.MAX_VALUE ? numbOne : -1;
        this.numbTwo = numbTwo < Integer.MAX_VALUE ? numbTwo : -1;
    }
}
