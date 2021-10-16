
/*
 *
 * Program to sort array using merge sort
 *
 * */

public class MergeSort {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,4,5,9,7,8,6,3,1,4,5,2};
        mergeSort (arr , 0, arr.length-1);

    }

    //Method for merge sort
    public static <T extends Comparable<T>> void mergeSort (T a[] , int low , int high )
    {
        if(low < high)
        {
            int mid = (low + high )/2;
            mergeSort (a,low,mid);
            mergeSort (a,mid+1,high);
            merge(a,low,mid,high);
        }
    }


    public static <T extends Comparable<T>> void merge(T a[] , int start, int mid, int end)
    {
        //stores the starting position of both parts in temporary variables.
        int p = start ,q = mid+1;
        Object[] arr1 = new Object[end-start+1];
        int k=0;
        for(int i = start ;i <= end ;i++)
        {
            //checks if first part comes to an end or not .
            if(p>mid)
            {
                arr1[k++] = a[q++] ;
            }
            //checks if second part comes to an end or not
            else if ( q > end)
            {
                arr1[k++] = a[p++];
            }
            //checks which part has smaller element.
            else if( a[p].compareTo(a[q])<0)
            {
                arr1[ k++ ] = a[p++];
            }
            else
            {
                arr1[ k++ ] = a[q++];
            }
        }
        for (int l=0 ; l< k ;l ++)
        {
            a[start++] = (T) arr1[l] ;
        }


        System.out.println("After Sorting:");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
