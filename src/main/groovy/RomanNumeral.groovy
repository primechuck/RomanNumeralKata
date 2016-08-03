class RomanNumeral {

    /**
     *  Converts a number to a Roman Numeral
     *
     *
     * @param input Integer to convert to Roman Numeral
     * */
    String toRomanNumeral(int input) {
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
