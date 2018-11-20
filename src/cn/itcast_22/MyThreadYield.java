package cn.itcast_22;

import java.util.Date;

public class MyThreadYield extends Thread{
    @Override
    public void run(){
        for(int x=0;x<10;x++){
            System.out.println(getName()+"----"+x + "-----" +new Date());
//            Thread.yield();  //暂停当前正在执行的线程对象，并执行其他线程  让多个线程的执行更和谐，但是不能靠它保证一人一次
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
