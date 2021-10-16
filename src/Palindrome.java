import java.util.Scanner;
/*
 *
 * Program to check palindrome number
 *
 * */
public class Palindrome {

    public static void main(String[] args) {
        int[] arr = new int[]{1587412};
        FindPalindrome(arr);

    }

    //Method to find Palindrome
    public static void FindPalindrome(int out[])
    {
        int len=out.length;
        for(int i=0;i<len;i++)
        {
            int r;
            int reverse = 0;
            int num=out[i];
            int temp=num;
            while(num>0)
            {
                r=num%10;
                reverse=(reverse*10)+r;
                num=num/10;
            }
            if(temp==reverse)
            {
                System.out.println(temp+" is Palindrome");
            }
            else
                System.out.println("not palindrome");
        }
    }

}
