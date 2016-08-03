class RomanNumeral {

    static final Map<Integer, String> NUMERALS = [
            100: "C",
            90: "XC",
            50: "L",
            40: "XL",
            10: "X",
            9: "IX",
            4: "IV",
            1: "I"
    ]

    /**
     *  Converts a number to a Roman Numeral
     *
     *
     * @param input Positive Integer to convert to Roman Numeral
     * */
    String toRomanNumeral(int input) {
        if (input < 1) throw new IllegalArgumentException("Input ${input} is out of range.  Must be greater than 0")
        String result = ""

        while (input > 0) {
            NUMERALS.each { number, numeral ->
                if (input >= number) {
                    result <<= numeral
                    input = input - number
                }
            }
        }
        return result
    }
}
