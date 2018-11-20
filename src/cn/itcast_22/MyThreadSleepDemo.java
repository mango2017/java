package cn.itcast_22;

public class MyThreadSleepDemo {
    public static void main(String[] args){
        MyThreadSleep ms = new MyThreadSleep();
        ms.start();
        MyThreadSleep ms1 = new MyThreadSleep();
        ms1.start();
    }
}
