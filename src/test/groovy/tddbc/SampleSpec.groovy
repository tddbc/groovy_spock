package tddbc;

import spock.lang.Specification
import spock.lang.Unroll

class SampleSpec extends Specification {

    def "should return 'Hello TDD BootCamp!' in Java"() {

        given:
        def sut = new SampleOfJava()

        when:
        String actual = sut.say()

        then:
        actual == 'Hello TDD BootCamp!'

    }

    @Unroll
    def "should return '#expected' in Groovy"() {

        given:
        def sut = new SampleOfGroovy()

        expect:
        sut.say() == expected

        where:
        expected << ['Hello TDD BootCamp!']

    }

}
