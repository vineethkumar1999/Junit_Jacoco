package main.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class GreatestThanLeftRight {
    public static void main(String[] args) {
      int[] arr = {10, 20, 15, 2, 23, 90, 67};
      List<Integer> res = new ArrayList<>();

      if(arr.length==1)
          res.add(arr[0]);

      if(arr[0]>arr[1])
      {
          res.add(arr[0]);
      }
      if(arr[arr.length-2] < arr[arr.length-1])
          res.add(arr[arr.length-2]);
      for(int i=1; i<arr.length-1;i++)
      {
          if(arr[i]>arr[i-1] && arr[i]<arr[i+1])
          {
              res.add(arr[i]);
          }
      }
    }
}

