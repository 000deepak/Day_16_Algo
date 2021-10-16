/*
 *
 * Program to search integer using binary search
 *
 * */

public class BinarySearchInterger {

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
