class RomanNumeral {

    /**
     *  Converts a number to a Roman Numeral
     *
     *
     * @param input Integer to convert to Roman Numeral
     * */
    String toRomanNumeral(int input) {
        String result = ""

        input.times {
            result <<= "I"
        }
        return result
    }
}
