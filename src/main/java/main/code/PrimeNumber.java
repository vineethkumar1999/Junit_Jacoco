package main.code;

public class PrimeNumber {
    private int start;
    private int end;
   public PrimeNumber(){
        start = 2;
        end = 2;
    }
    public PrimeNumber(int s){
        start = 2;
        end = s;
    }

    public boolean CheckPrime()
    {
        for(int i=start+1;i<=end-1;i++)
        {
            if(end%i==0)
            {
                System.out.println("Not Prime Number");
                return false;
            }
        }
        System.out.println("Its a prime Number");
        return true;
    }

}
