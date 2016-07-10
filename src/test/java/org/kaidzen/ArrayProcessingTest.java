package org.kaidzen;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ArrayProcessingTest {

    private ArrayProcessing processing;

    @Before
    public void initTest(){
        processing = new ArrayProcessing();
    }

    @After
    public void afterTest(){
        processing = null;
    }

    @Test
    public void testCreateArray() throws Exception {
        int[] testArray = processing.createArray(4);
        Assert.assertEquals(4, testArray.length);
    }

    @Test
    public void testGetSecondMax() throws Exception {
        int[] testArray = new int[]{4, 8, 9, 10};
        processing = new ArrayProcessing(testArray);
        Assert.assertEquals(9, processing.getSecondMax());
    }

    @Test
    public void testSortArray() throws Exception {
        int[] testArray = new int[]{9, 8, 4, 10};
        int[] expectedArray = new int[]{4, 8, 9, 10};
        processing = new ArrayProcessing(testArray);
        processing.sortArray();
        Assert.assertArrayEquals(expectedArray, processing.getSortedArray());
    }
}