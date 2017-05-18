package helloworld

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(HelloController)
class HelloControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test index"() {
        when:
        controller.index()
        then: "fix me"
        response.text == "Hello, World!"
    }
}
