package main;
import main.numerals.*;
import main.operations.*;

public class Given {
    private Numeral a, b;
    private Action arithmeticOperation;

    public Numeral getA() {
        return a;
    }

    public Numeral getB() {
        return b;
    }

    public Action getArithmeticOperation() {
        return arithmeticOperation;
    }

    public Given() throws Exception {
        String given = ConsoleHelper.readString();
        String[] strings = given.split(" ");
        if (strings.length != 3) {
            throw new IllegalArgumentException();
        }
        if (RomanNumerals.isRoman(strings[0]) && RomanNumerals.isRoman(strings[2])) {
            this.a = new Numeral(RomanNumerals.valueOf(strings[0]).getValue());
            this.a.setRoman();
            this.b = new Numeral(RomanNumerals.valueOf(strings[2]).getValue());
            this.b.setRoman();
        } else if (Integer.parseInt(strings[0]) >= 1 && Integer.parseInt(strings[0]) <= 10
                && Integer.parseInt(strings[2]) >= 1 && Integer.parseInt(strings[2]) <= 10) {
            this.a = new Numeral(Integer.parseInt(strings[0]));
            this.b = new Numeral(Integer.parseInt(strings[2]));
        } else {
            throw new IllegalArgumentException();
        }
        if (strings[1].equals("*")) {
            this.arithmeticOperation = new Multiplication();
        } else if (strings[1].equals("/")) {
            this.arithmeticOperation = new Division();
        } else if (strings[1].equals("+")) {
            this.arithmeticOperation = new Addition();
        } else if (strings[1].equals("-")) {
            this.arithmeticOperation = new Subtraction();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
