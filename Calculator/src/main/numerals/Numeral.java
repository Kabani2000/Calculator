package main.numerals;

public class Numeral {
    private final int value;
    private boolean isRoman = false;

    public Numeral(int value) {
        this.value = value;
    }

    public boolean isRoman() {
        return isRoman;
    }

    public void setRoman() {
        isRoman = true;
    }

    public int getValue() {
        return value;
    }
}
