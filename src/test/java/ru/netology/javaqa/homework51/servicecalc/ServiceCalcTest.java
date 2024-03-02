package ru.netology.javaqa.homework51.servicecalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ServiceCalcTest {
    @Test
    public void test() {

        ServiceCalc service = new ServiceCalc();

        int expected = 3;

        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1() {

        ServiceCalc service = new ServiceCalc();

        int expected = 2;

        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
