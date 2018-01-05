import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args)
 {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        //input Default..
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        int q=sc.nextInt();
        String []Q=new String[q];
        //Query input..
        for(int i=0;i<q;i++)
        {
            Q[i]=sc.next();
        }
        //comparison in query and input..
        for(int i=0;i<q;i++)
        {int p=0;
            for(int j=0;j<s.length;j++)
            {
                if(s[j].equals(Q[i]))
                {
                    p++;
                }
                    
            }
		System.out.println(p);
        }   
    }
}