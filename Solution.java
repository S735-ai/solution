
package com.solution;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Solution {



    public static boolean getresult(String str)
    {
      // your code goes here

      String revStr = str;
 
      StringBuffer sbr = new StringBuffer(revStr);
        
      sbr.reverse();
      
      String rstr = sbr.toString();

      if(str.equals(rstr))
      {
          return true;
      }
      else
      {
        return false;
      }

    }



    public static void main(String[] args)
    {
        if (args.length < 1)
        {
             System.exit(1);
        }
        String str = args[0];
        if (str.length() < 0)
        {
             System.exit(2);
        }
        boolean result = Solution.getresult(str);
        System.out.print("is (" + str + ") a palindrome:  " + result + "\n");
    }

}