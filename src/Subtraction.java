public class Subtraction extends Calculator {

    public Subtraction(int numbOne, int numbTwo) {
        super(numbOne, numbTwo);
        int subResult = numbOne - numbTwo;
        System.out.println("Result is " + subResult);
    }
}
