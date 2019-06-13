package main.ctci.c1;

import org.junit.Test;

import static ctci.c1.IsUnique.isUniqueInString;
import static org.junit.Assert.assertEquals;

public class isUniqueTest {

    @Test
    public void isUniqueInStringTest() {
        assertEquals(true, isUniqueInString("lopez"));
        assertEquals(false, isUniqueInString("java"));
    }

}
