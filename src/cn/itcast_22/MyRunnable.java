package cn.itcast_22;

public class MyRunnable implements  Runnable {
    @Override
    public void run(){
        for (int x=0;x<10;x++){
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}
