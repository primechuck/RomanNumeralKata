class RomanNumeral {

    static final Map<Integer, String> NUMERALS_TABLE = [
            1000: "M",
            900 : "CM",
            500 : "D",
            400 : "CD",
            100 : "C",
            90  : "XC",
            50  : "L",
            40  : "XL",
            10  : "X",
            9   : "IX",
            6   : "VI",
            4   : "IV",
            1   : "I"
    ]

    /**
     *  Converts a number to a Roman Numeral
     *
     *
     * @param input Positive Integer to convert to Roman Numeral
     * */
    String toRomanNumeral(int input) {
        if (input < 1) throw new IllegalArgumentException("Input ${input} is out of range.  Must be greater than 0")
        StringBuilder result = new StringBuilder()
        /**
         * Create a list of keys editable for later
         **/
        List numberList = NUMERALS_TABLE.keySet() as List
        while (input > 0) {
            /**
             * Before comparing remove any numbers higher the current input
             */
            numberList.removeAll { it > input }

            /**
             * Choose the highest remaining mapped value in the list
             * Use the value to check against conversion map and decrement input
             */
            int remainder = numberList.max()
            result << NUMERALS_TABLE[remainder]
            input = input - remainder
        }
        result
    }
}
