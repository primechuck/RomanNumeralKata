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
        input << [1, 3, 4, 9, 10, 14]
        result << ["I", "III", "IV", "IX", "X", "XIV"]
    }
}