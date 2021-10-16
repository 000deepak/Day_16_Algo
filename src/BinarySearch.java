import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *
 * Progrma for  binary search
 *
 * */
public class BinarySearch {
    public static  void main(String[] args) {

        Integer[] arr = new Integer[]{1,4,5,9,7,8,6,3,1,4,5,2};
        BinarySearch(arr , 8);

    }


    //Method to search integer using binary search
    public static<T extends Comparable<T>> void BinarySearch(T[] array,T search)
    {
        int length=array.length;
        int first=0;
        int last=length-1;
        int mid;

        while(first<=last)
        {    mid=(first+last)/2;
            if(array[mid].compareTo(search)<0)
            {
                first=mid+1;
            }
            else if(array[mid].compareTo(search)==0)
            {
                System.out.println(search+" found in location "+mid);
                break;
            }
            else if(array[mid].compareTo(search)>0)
            {
                last=mid-1;
            }
        }
        if(first > last)
        {
            System.out.println(search+"Not found");
        }
    }
}
