public class Multiplication extends Calculator {

    public Multiplication(int numbOne, int numbTwo) {
        super(numbOne, numbTwo);
        int mulResult = numbOne * numbTwo;
        System.out.println("Result is " + mulResult);
    }
}
