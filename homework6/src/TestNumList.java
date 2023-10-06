import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TestNumList {
    NumList num;
    ArrayList<Integer> list1;
    ArrayList<Integer> list2;

    @BeforeEach
    void testinit() {
        num = new NumList();
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }

    @Test
    void testAverage() {
        list1.add(6);
        list1.add(10);
        list1.add(-1);
        list2.add(8);
        list2.add(-2);
        list2.add(0);
        assertEquals(num.average(list1), 5.0);
        assertEquals(num.average(list2), 2.0);
    }

    //проверка, если списки из одного элемента
    @Test
    void testAverageIfOneElement() {
        list1.add(-1);
        list2.add(8);
        assertEquals(num.average(list1), -1.0);
        assertEquals(num.average(list2), 8.0);
    }

    //проверка, если список пустой
    @Test
    void testException() {
        list1.add(6);
        list1.add(10);
        list1.add(-1);
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            num.average(list2);
        });

        String expectedMessage = "Пустой список";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    void testCompareListsFirstAverageMore() {
        list1.add(6);
        list1.add(10);
        list1.add(-1);
        list2.add(8);
        list2.add(-2);
        list2.add(0);
        assertEquals(num.compareLists(list1, list2), "Первый список имеет большее среднее значение");
    }

    @Test
    void testCompareListsSecondAverageMore() {
        list1.add(6);
        list1.add(4);
        list1.add(-1);
        list2.add(10);
        list2.add(3);
        list2.add(0);
        assertEquals(num.compareLists(list1, list2), "Второй список имеет большее среднее значение");
    }

    @Test
    void testCompareListsEqual() {
        list1.add(6);
        list1.add(4);
        list1.add(-1);
        list2.add(7);
        list2.add(3);
        list2.add(-1);
        assertEquals(num.compareLists(list1, list2), "Средние значения равны");
    }
}
