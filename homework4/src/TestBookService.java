import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestBookService {

    List<Book> bookList;

    @BeforeEach
    void testinit() {
        bookList = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2"),
                new Book("3", "Book3", "Author3"),
                new Book("4", "Book4", "Author4"),
                new Book("5", "Book5", "Author5")
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3", "4", "5"})
    void testFindBookById(String id) {
        InMemoryBookRepository bookRepository = mock(InMemoryBookRepository.class);

        when(bookRepository.findById(id)).thenReturn(bookList.get(Integer.parseInt(id) - 1));

        BookService bookService = new BookService(bookRepository);

        assertEquals(String.format("Book {id='%1$s', title='Book%1$s', author='Author%1$s'}", id),
                bookService.findBookById(id).toString());
    }

    @Test
    void testFindAllBooks() {
        InMemoryBookRepository bookRepository = mock(InMemoryBookRepository.class);

        when(bookRepository.findAll()).thenReturn(bookList);

        BookService bookService = new BookService(bookRepository);

        assertEquals(bookList, bookService.findAllBooks());
    }
}
