package main;

public class Main {
    public static void main(String[] args) {
       try {
           Given given = new Given();
           Calculator calculator = new Calculator(given);
           calculator.calculate();
           calculator.showResult();
        } catch (Exception e) {
            System.out.println("Input Error");
        }
    }
}
