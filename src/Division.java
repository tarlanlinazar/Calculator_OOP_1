public class Division extends Calculator {

    public Division(int numbOne, int numbTwo) {
        super(numbOne, numbTwo);
        int divResult = numbOne / numbTwo;
        System.out.println("Result is " + divResult);
    }
}
