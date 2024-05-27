package miu.edu.cse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalcTest {

    private MyCalc myCalc;

    @BeforeEach
    void setUp() {
        myCalc = new MyCalc();
    }

    @AfterEach
    void tearDown() {
        myCalc = null;
    }

    @Test
    void add() {
        int actual = myCalc.add(1, 2);
        assertEquals(3, actual);
    }
}