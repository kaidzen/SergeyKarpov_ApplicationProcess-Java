package org.kaidzen;

public class Main {

    public static void main(String[] args) {

        ArrayProcessing arrayProcessing = new ArrayProcessing();

        arrayProcessing.createArray(100);
        int[] array = arrayProcessing.getSampleArray()
        int[] arrayInts = arrayProcessing.getSortedArray();

        /**
         * find the second largest integer in an array.
         * @param ia an array of integers
         * @return the second largest number in ia
         */
        private int secondLargest(int[] ia){
            int secondLarg = arrayProcessing.getSecondMax();
            return;
        } //secondLargest

        /**
         * print (System.out.println()) all pairs of numbers chosen from ia, such that each pair of numbers adds up to target.
         * @param ia an array of integers
         * @param target the target integer
         */
        private void findPairs(int[] ia,int target)
        {
        } //findPairs

    }
}
