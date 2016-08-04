import org.spockframework.util.ReflectionUtil
import spock.lang.Specification
import spock.lang.Unroll


class RomanNumeralTest extends Specification {

    RomanNumeral romanNumeral

    def setup() {
        romanNumeral = new RomanNumeral()
    }

    def "RomanNumeral Class is present"() {
        expect:
        ReflectionUtil.isClassAvailable("RomanNumeral")
    }

    def "toRomanNumeral() method is available"() {
        expect:
        ReflectionUtil.isMethodAvailable("RomanNumeral", "toRomanNumeral")
    }

    def "toRomanNumeral() throws exception when 0 is entered"() {
        when:
        Integer input = 0
        romanNumeral.toRomanNumeral(input)

        then:
        thrown(IllegalArgumentException)
    }

    @Unroll("Method toRomanNumeral() Accepts #input and returns #result")
    def "toRomanNumeral() method accepts number and returns roman numerals"() {
        expect:
        romanNumeral.toRomanNumeral(input) == result

        where:
        input << [1, 3, 4, 6, 7, 9, 10, 14, 40, 44, 50, 90, 94, 100, 400, 500, 1066, 1993, 1989 ]
        result << ["I", "III", "IV", "VI", "VII", "IX", "X", "XIV", "XL", "XLIV", "L", "XC", "XCIV", "C", "CD", "D", "MLXVI", "MCMXCIII", "MCMLXXXIX"]
    }
}