package helloworld

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Genre)
class GenreSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        given:
        def genre = new Genre(name: "Horror")

        genre.save()

        expect: "fix me"
        Genre.count() == 1
    }
}
