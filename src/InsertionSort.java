/*
*
* Progrma fo insertion sort
*
* */
public class InsertionSort {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,4,5,9,7,8,6,3,1,4,5,2};
        insertionSort(arr);
    }

    //Method For Insertion Sort
    public static <T extends Comparable<T>> void insertionSort(T array[]) {
        int length=array.length;
        int j;
        T temp;
        for(int i=0;i<length;i++)
        {
            j=i;
            temp = array[i];
            while(j>0&&temp.compareTo(array[j-1])<0)
            {//
                array[j]=array[j-1];
                j=j-1;
            }
            array[j]=temp;//insert unsorted element
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

}
