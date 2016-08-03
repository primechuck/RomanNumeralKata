import org.spockframework.util.ReflectionUtil
import spock.lang.Specification


class RomanNumeralTest extends Specification {

    def "RomanNumeral Class is present"(){
        expect:
        ReflectionUtil.isClassAvailable("RomanNumeral")
    }
}