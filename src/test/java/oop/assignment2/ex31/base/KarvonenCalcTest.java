package oop.assignment2.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenCalcTest {

    @Test
    byte calculation(int i, int i1) {
        KarvonenCalcTest testUnit = new KarvonenCalcTest();

        //when
         testUnit.calculation(22,65);

         String a = "string";


         assertEquals(a,testUnit.calculation(22,65));

        return 0;
    }
}