package main.numerals;

public enum RomanNumerals {
    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9),
    X(10);

    private int value;

    RomanNumerals(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static boolean isRoman(String name) {
        for (RomanNumerals numeral : RomanNumerals.values()) {
            if (name.equals(numeral.name())) {
                return true;
            }
        }
        return false;
    }

    public static RomanNumerals byValue(int value) {
        for (RomanNumerals numeral : RomanNumerals.values()) {
            if (numeral.value == value) {
                return numeral;
            }
        }
        return null;
    }
}
