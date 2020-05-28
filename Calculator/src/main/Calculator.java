package main;

import main.numerals.Numeral;
import main.numerals.RomanNumerals;

public class Calculator {
    private Given given;
    private Numeral result;

    public Calculator(Given given) {
        this.given = given;
    }

    public void calculate() {
        result = given.getArithmeticOperation().calculate(given.getA(), given.getB());
        if (given.getA().isRoman() && given.getB().isRoman()) {
            result.setRoman();
        }
    }

    public void showResult() {
        if (result.isRoman()) {
           ConsoleHelper.writeMessage(RomanNumerals.byValue(result.getValue()).toString());
        } else {
            ConsoleHelper.writeMessage(result.getValue());
        }
    }
}
