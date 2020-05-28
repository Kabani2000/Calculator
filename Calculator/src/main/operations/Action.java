package main.operations;

import main.numerals.Numeral;

public abstract class Action {
    public abstract Numeral calculate(Numeral a, Numeral b);
}
