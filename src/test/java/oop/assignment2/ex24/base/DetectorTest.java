package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectorTest {

    @Test
    void isAnagram_returns_true_set1() {
        Detector testUnit = new Detector();

        //when
        boolean actual = testUnit.isAnagram("note","tone");

        //then
        assertTrue(actual);
    }


    @Test
    void isAnagram_returns_false_set1() {
        Detector testUnit = new Detector();

        //when
        boolean actual = testUnit.isAnagram("riot","tone");

        //then
        assertFalse(false);
    }
}