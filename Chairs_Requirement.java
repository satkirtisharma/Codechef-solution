/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        while(s-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y)System.out.println(x-y);
            else System.out.println(0);
        }
	}
}