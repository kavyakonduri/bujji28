/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int arr[]={1,2,3};
     static int smallest()
     {
          int i;
          int min=arr[0];
          for(i=1;i<arr.length;i++)
               if(arr[i] < min)
                      min=arr[i];
          return min;
     }
       public static void main(String[] args)
       {
          System.out.println(" "+smallest());
       }
     
}
	
