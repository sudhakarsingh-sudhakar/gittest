#time complexity issue require more efficient algo  
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] leftRotation(int[] a, int d) {
        // Complete this function
        for(int j=0;j<d;j++)
        {int temp=0;
            for(int i=0;i<a.length;i++)
            {
                if(i-1<0)
                {
                    temp=a[i];
                }
                else
                {
                    a[i-1]=a[i];
                }
                if(i==a.length-1)
                {
                    a[a.length-1]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
