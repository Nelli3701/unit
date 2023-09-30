import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    HomeWork hw;

    @BeforeEach
    void testinit() {
        hw = new HomeWork();
    }

    //Задание 1.
    @ParameterizedTest
    @ValueSource(ints = {0, 2, 10, 8})
    void testTrueEvenOddNumber(int n) {
        assertTrue(hw.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 11, 109})
    void testFalseEvenOddNumber(int n) {
        assertFalse(hw.evenOddNumber(n));
    }

    //Задание 2.
    @ParameterizedTest
    @ValueSource(ints = {26, 80, 99})
    void testNumberInInterval(int n) {
        assertTrue(hw.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 3, 100, 205})
    void testNumberNotInInterval(int n) {
        assertFalse(hw.numberInInterval(n));
    }
}
