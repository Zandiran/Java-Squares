package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import ru.netology.sQrRService;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    sQrRService sqrRService = new sQrRService();
    @Test
   void smallNumbers () {

      int top = 30;
      int bot = 10;
      int expected = 0;

      int actual = sqrRService.Numbers(top, bot);

      assertEquals(expected, actual);
    }
    @Test
    void hugeNumbers () {

        int top = 3000;
        int bot = 1000;
        int expected = 23;

        int actual = sqrRService.Numbers(top, bot);

        assertEquals(expected, actual);
    }
    @Test
    void smallGap () {

        int top = 111;
        int bot = 100;
        int expected = 1;

        int actual = sqrRService.Numbers(top, bot);

        assertEquals(expected, actual);
    }
    @Test
    void hugeGap () {

        int top = 5000;
        int bot = 100;
        int expected = 61;

        int actual = sqrRService.Numbers(top, bot);

        assertEquals(expected, actual);
    }
}
