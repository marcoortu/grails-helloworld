package helloworld

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Author)
class AuthorSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        given: "An author is created"
        new Author(name: "R. R. George", surname: "Martin").save()

        expect: "fix me"
        Author.count() == 1
    }
}
