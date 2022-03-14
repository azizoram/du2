package cz.cvut.fel.du2;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator test = new Calculator();
    @Test
    @Order(1)
     void SumTest(){
        assertEquals(test.add(5, 6), 11);
    }
    @Test
    @Order(2)
    void SubstTest(){
        assertEquals(test.subtract(5, 6), -1);
    }
    @Test
    @Order(3)
    void MultyTest(){
        assertEquals(test.multiply(5, 6), 30);
    }
    @Test
    @Order(5)
    void DivTest(){
        assertEquals(test.divide(5, 5), 1);
    }
    @Order(4)
    @Test()
    public void testDivideByZero() {
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            test.divide(2,0);});

        String exceptedMessage = "/ by zero";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(exceptedMessage, actualMessage);
    }
}
