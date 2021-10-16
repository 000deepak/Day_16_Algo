/*
*
* Program to check if two strings are anagram
*
* */

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        System.out.println("enter string1");
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        System.out.println("enter string2");
        String string2 = sc.next();
        if(Anagram(string1,string2))
            System.out.println("anagrams");
        else
            System.out.println("not anagrams");
    }


    //Method for Anagram String
    public static boolean Anagram(String str1, String str2)
    {
        char[] string1=str1.toCharArray();
        char[] string2=str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        boolean isAnagram =false;
        isAnagram = Arrays.equals(string1, string2);
        if(isAnagram==true)
        {
            //pSystem.out.println(str1+" , "+str2+" are Anagram Strings");
            return isAnagram;
        }
        else
            //System.out.println(str1+" , "+str2+" are not Anagram Strings");
            return isAnagram;
    }
}
