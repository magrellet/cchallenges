package hrank.amonthofcoding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{3, 2, 1};

        BubbleSort sort= new BubbleSort();

        assertEquals(a[0], sort.bubbleSort(b)[0]);
        //assertEquals(a[1], sort.bubbleSort(b)[1]);
        //assertEquals(a[2], sort.bubbleSort(b)[2]);


    }


}
