package helloworld

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
@Mock([Genre, Author])
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        given: "Author and Genre are created"
        def author = new Author(name: "R.R. Martin", surname: "George")
        def genre = new Genre(name: "fantasy")

        author.save()
        genre.save()

        when: "Book is created"
        def bookId = new Book(title: "A game of throne",
                genre: genre, author: author).save().id

        then: "fix me"
        Book.count() == 1
        def book = Book.findById(bookId)
        book != null
        book.author == author
        book.genre == genre
    }
}
