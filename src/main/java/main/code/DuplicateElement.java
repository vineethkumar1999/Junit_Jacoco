package main.code;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,6,3,6,1};
        int[] res =  new int[arr.length];
        Map<Integer,Integer> countMap = new HashMap<>();
        int j=0;
        for(int i : arr)
        {
            if(countMap.containsKey(i))
            {
                System.out.println("First repeating element" +i);
                countMap.put(i, countMap.get(i) + 1);
                res[j] = i;
                j++;
            }
            else
                countMap.put(i,1);
        }

        for(Map.Entry<Integer,Integer> entry : countMap.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey() + " Element is repeated " +entry.getValue() + " Times");
            }
        }
        for(int i:res)
            if(i!=0)
            System.out.println(i);
    }
}
