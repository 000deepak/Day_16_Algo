/*
* code for sorting array in ascending order and descending order
*
* */

public class BubbleSort {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,4,5,9,7,8,6,3,1,4,5,2};
        bubbleSortAscending(arr);
        bubbleSortDescending(arr);
    }

    //Method for Bubble Sort Ascending
    public static <T extends Comparable<T>> void bubbleSortDescending(T array[]) {
        int length=array.length;
        for(int i=0;i<length-1;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(array[i].compareTo(array[j])>0)
                {
                    T temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    //Method for Bubble Sort Ascending
    public static Integer[] bubbleSortAscending(Integer[] binaryIntArray) {

        int n = binaryIntArray.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (n - 1 - i); j++) {
                if(binaryIntArray[j] < binaryIntArray[j+1]) {
                    int temp = binaryIntArray[j];
                    binaryIntArray[j] = binaryIntArray[j+1];
                    binaryIntArray[j+1] = temp;
                }
            }
        }

        return binaryIntArray;
    }
}
