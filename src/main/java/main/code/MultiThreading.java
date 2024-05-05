package main.code;


class Run extends Thread{
    public void run()
    {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000);
                System.out.println("Running" +this.getName());
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException
    {
        Run r1 = new Run();
        r1.start();
        Run r2 = new Run();
        r2.start();
        System.out.println(r1.getName());
        r1.setName("Thread1");
        r2.setName("Thread2");
        System.out.println(r1.getName());
        Run2 r3 = new Run2("Thread3");
        Run2 r4 = new Run2("Thread4");
        r3.x.start();
        r4.x.start();
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000);
                System.out.println("Main Running");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        r1.join();
        r2.join();
        r3.x.join();
        r4.x.join();
        System.out.println("In Main");


    }
}
class Run2 implements Runnable{
   public Thread x;

    Run2(String Name)
    {
       x = new Thread(this,Name);
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000);
                System.out.println("Running" + x.getName());
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
