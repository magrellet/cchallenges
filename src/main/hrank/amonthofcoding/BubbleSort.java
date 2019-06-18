package hrank.amonthofcoding;

public class BubbleSort {

    public int[] bubbleSort(int[] arrayToSort) {

        int swapCounter = 0;
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 0; j < arrayToSort.length - 1; j++) {
                int aux;
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    //swap
                    swapCounter++;
                    aux = arrayToSort[j + 1];
                    arrayToSort[j + 1] = arrayToSort[j];
                    arrayToSort[j] = aux;
                }

            }
        }
        System.out.println("Array is sorted in "+swapCounter+" swaps.");
        System.out.println("First Element: "+arrayToSort[0]);
        System.out.println("Last Element: "+arrayToSort[arrayToSort.length-1]);
        return arrayToSort;
    }

}
