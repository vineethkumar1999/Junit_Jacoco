package main.code;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BankException extends Exception {
    int balance, withdraw;
    BankException(int b, int w)
    {
        balance = b;
        withdraw = w;
    }

    public void inform()
    {
        System.out.println("InSufficient Balance");
    }
}

class Customer{
    int b=500;
    void withdraw(int amount) throws BankException
    {
        if(amount>b)
            throw new BankException(b,amount);
        b-=amount;
    }
}

public class ExceptionTest {
    public static void main(String[] args) {
        int withdraw;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Withdraw amount");
        try {
            withdraw = Integer.parseInt(br.readLine());
            Customer c = new Customer();
            c.withdraw(withdraw);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        catch (BankException ex)
        {
            System.out.println(ex);
            ex.inform();
        }
    }
}
