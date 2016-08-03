import org.spockframework.util.ReflectionUtil
import spock.lang.Specification


class RomanNumeralTest extends Specification {

    def "RomanNumeral Class is present"() {
        expect:
        ReflectionUtil.isClassAvailable("RomanNumeral")
    }

    def "toRomanNumeral() method is available"() {
        expect:
        ReflectionUtil.isMethodAvailable("RomanNumeral", "toRomanNumeral")
    }

    def "toRomanNumeral() method accepts 1 and returns I"() {
        setup:

        RomanNumeral romanNumeral = new RomanNumeral()

        when:
        String result = romanNumeral.toRomanNumeral(1)

        then:
        result == "I"
    }

    def "toRomanNumeral() method accepts 3 and returns III"() {
        setup:

        RomanNumeral romanNumeral = new RomanNumeral()

        when:
        String result = romanNumeral.toRomanNumeral(3)

        then:
        result == "III"
    }

}