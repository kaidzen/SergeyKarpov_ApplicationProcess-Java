package org.kaidzen;

import java.util.Arrays;
import java.util.Random;

public class ArrayProcessing {

    Random r = new Random();
    private int[] sampleArray = null;
    private int[] sortedArray = null;

    public int[] getSampleArray() {
        return sampleArray;
    }

    public void setSampleArray(int[] sampleArray) {
        this.sampleArray = sampleArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }


    public ArrayProcessing() {
    }

    public ArrayProcessing(int[] sampleArray) {
        this.sampleArray = sampleArray;
    }

    public int[] createArray(int capacity){
        if (capacity<=0){
            int[] array = new int[30];
            for (int i=0; i<array.length; i++){
                array[i] = r.nextInt(100)+1;
            }
            sampleArray = array;
            return array;
        }
        int[] array = new int[capacity];
        for (int i=0; i<array.length; i++){
            array[i] = r.nextInt(100)+1;
        }
        sampleArray = array;
        return array;
    }

    public int getSecondMax(){
        int[] array = getSampleArray();
        int j=array.length-1;
        int firstHighest=0;
        int secondHighest=0;
        if (array[0]>array[array.length-1]){
            firstHighest=array[0];
            secondHighest=array[array.length-1];
        }else {
            firstHighest=array[array.length-1];
            secondHighest=array[0];
        };
        j--;
        for(int i=1;i<=array.length/2;i++,j--)
        {
            if(array[i] < array[j] )
            {
                if(firstHighest < array[j]){
                    secondHighest=firstHighest;
                    firstHighest= array[j];
                }
                else if(secondHighest < array[j] ) {
                    secondHighest= array[j];

                }
            }
            else {
                if(firstHighest < array[i])
                {
                    secondHighest=firstHighest;
                    firstHighest= array[i];

                }
                else if(secondHighest < array[i] ) {
                    secondHighest= array[i];

                }
            }

        }
        return secondHighest;
    }

    public void sortArray(){
        sortedArray = sampleArray;
        Arrays.sort(sortedArray);
    }

    public void findPairs(int[] arrayInts, int sum){
        if(arrayInts == null || arrayInts.length < 2){
            return;
        }

        int left = 0;
        int right = arrayInts.length - 1;
        java.util.Arrays.sort(arrayInts);
        while(left < right){
            int i = arrayInts[left];
            int j = arrayInts[right];
            if(i+j == sum){
                System.out.println("The pair is "+i+" and "+j);
                left++;
                right--;
            }else if(i+j > sum){
                right--;
            }else{
                left++;
            }
        }
    }


}
