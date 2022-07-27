public class Addition extends Calculator{

    public Addition(int numbOne, int numbTwo) {
        super(numbOne, numbTwo);
        int sumResult = numbOne + numbTwo;
        System.out.println("Result is " + sumResult);
    }
}

