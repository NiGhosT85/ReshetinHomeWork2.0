package HomeWork9.src.test.java;

import HomeWork9.src.main.java.ru.Reshetin.ManipulationNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Идет тест класса ManipulationUtil")
public class ManipulationUtilTest {
    private final ManipulationNumber manipulationNumber = new ManipulationNumber();

    @Test
    void testAdd() {
        Assertions.assertEquals(8.0, manipulationNumber.addMethod(3, 5));
    }

    @Test
    void testDifference() {
        Assertions.assertEquals(-5.0, manipulationNumber.differenceMethod(2, 7));
    }

    @Test
    void testMultiplication() {
        Assertions.assertEquals(24.0, manipulationNumber.multiplicationMethod(6, 4));
    }

    @Test
    void testMultiplicationByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                manipulationNumber.multiplicationMethod(6, 0));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2.0, manipulationNumber.divideMethod(10, 5));
    }

    @Test
    void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> manipulationNumber.divideMethod(10, 0));
    }

    @Test
    void testPower() {
        Assertions.assertEquals(8.0, manipulationNumber.powerMethod(2, 3));
    }
}
