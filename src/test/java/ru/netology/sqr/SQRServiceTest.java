package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calcTest1() {
        SQRService service = new SQRService();

        int actual = service.calcSQR(10, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTest3() {
        SQRService service = new SQRService();

        int actual = service.calcSQR(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTest0() {
        SQRService service = new SQRService();

        int actual = service.calcSQR(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}