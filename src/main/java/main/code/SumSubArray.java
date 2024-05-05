package main.code;

public class SumSubArray {
    public static void main(String[] args)
    {
        int[] arr = {1,4,20,3,2,5};
        int x = 5;

        int low =0 , high = 0, sum =0;

        while(high<arr.length)
        {
            sum+=arr[high];

           while(sum>x)
           {
               sum-=arr[low];
               low++;
           }
            if(sum==x)
            {
                System.out.println("Found between " +low +" And " +high);

            }
           high++;
        }

    }
}
