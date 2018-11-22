package cn.itcast_22;

import java.util.Date;

public class ThreadStop extends Thread{
    @Override
    public void run(){
        System.out.println("开始执行：" + new Date());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("终止执行");
        }
        System.out.println("结束执行："+new Date());
    }
}
