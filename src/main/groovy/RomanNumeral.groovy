class RomanNumeral {

    /**
     *  Converts a number to a Roman Numeral
     *
     *
     * @param input Positive Integer to convert to Roman Numeral
     * */
    String toRomanNumeral(int input) {
        if (input < 1) throw new IllegalArgumentException ("Input ${input} is out of range.  Must be greater than 0")
        String result = ""

        while (input > 0) {
            if (input <= 3) {
                result <<= "I"
                input = input - 1
            }
        }
        return result
    }
}
