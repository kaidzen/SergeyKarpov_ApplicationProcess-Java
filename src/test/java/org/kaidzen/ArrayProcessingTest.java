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
        Assert.assertEquals(9, processing.getSecondMax(testArray));
    }

    @Test
    public void testSortArray() throws Exception {
        int[] testArray = new int[]{9, 8, 4, 10};
        int[] expectedArray = new int[]{4, 8, 9, 10};
        processing = new ArrayProcessing(testArray);
        processing.sortArray();
        Assert.assertArrayEquals(expectedArray, processing.getSortedArray());
    }

    @Test
    public void testFindPairsOnDefinedArray() throws Exception {
        int[] testArray = new int[]{9, 4};
        String expected = "The pair is 4 and 9\n";
        String actual = processing.findPairs(testArray, 13);
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void testFindPairs() throws Exception {
        int[] testArray = processing.createArray(100);
        System.out.println(testArray.toString());
        String actual = processing.findPairs(testArray, 37);
        System.out.println(actual);
        Assert.assertTrue(actual.length()>0);
    }
}