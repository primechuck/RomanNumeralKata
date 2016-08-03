import org.spockframework.util.ReflectionUtil
import spock.lang.Specification
import spock.lang.Unroll


class RomanNumeralTest extends Specification {

    RomanNumeral romanNumeral

    def setup(){
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

    @Unroll("Method Accepts #input and returns #result")
    def "toRomanNumeral() method accepts number and returns roman numerals"() {
        expect:
        romanNumeral.toRomanNumeral(input) == result

        where:
        input << [ 1, 3]
        result << [ "I", "III"]
    }

}