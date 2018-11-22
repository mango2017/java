package cn.itcast_22;

import java.util.Date;

public class MyThreadSleep extends Thread {
    @Override
    public void run(){
        for(int x=0;x<10;x++){
            System.out.println(getName()+"----"+x + "----"+ new Date());
            try {
                Thread.sleep(1000);  //ctrl+alt+t  try catch  线程休眠
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

