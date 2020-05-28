package main.operations;

import main.numerals.Numeral;

public class Multiplication extends Action {

    @Override
    public Numeral calculate(Numeral a, Numeral b) {
        return new Numeral(a.getValue() * b.getValue());
    }
}
