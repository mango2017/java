package cn.itcast_22;

import java.util.Date;

public class MyThreadYield1 extends Thread{
    @Override
    public void run(){
        for(int x=5;x<10;x++){
            System.out.println(getName()+"----"+x +"-----" +new Date());
//            Thread.yield();  //暂停当前正在执行的线程对象，并执行其他线程  让多个线程的执行更和谐，但是不能靠它保证一人一次
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//用时18秒
//牛掰----5-----Tue Nov 20 17:33:52 CST 2018
//        无敌----0-----Tue Nov 20 17:33:52 CST 2018
//        无敌----1-----Tue Nov 20 17:33:54 CST 2018
//        牛掰----6-----Tue Nov 20 17:33:54 CST 2018
//        牛掰----7-----Tue Nov 20 17:33:56 CST 2018
//        无敌----2-----Tue Nov 20 17:33:56 CST 2018
//        无敌----3-----Tue Nov 20 17:33:58 CST 2018
//        牛掰----8-----Tue Nov 20 17:33:58 CST 2018
//        无敌----4-----Tue Nov 20 17:34:00 CST 2018
//        牛掰----9-----Tue Nov 20 17:34:00 CST 2018
//        无敌----5-----Tue Nov 20 17:34:02 CST 2018
//        无敌----6-----Tue Nov 20 17:34:04 CST 2018
//        无敌----7-----Tue Nov 20 17:34:06 CST 2018
//        无敌----8-----Tue Nov 20 17:34:08 CST 2018
//        无敌----9-----Tue Nov 20 17:34:10 CST 2018

//用时26秒

//无敌----0-----Tue Nov 20 17:34:55 CST 2018
//        无敌----1-----Tue Nov 20 17:34:57 CST 2018
//        无敌----2-----Tue Nov 20 17:34:59 CST 2018
//        无敌----3-----Tue Nov 20 17:35:01 CST 2018
//        无敌----4-----Tue Nov 20 17:35:03 CST 2018
//        无敌----5-----Tue Nov 20 17:35:05 CST 2018
//        无敌----6-----Tue Nov 20 17:35:07 CST 2018
//        无敌----7-----Tue Nov 20 17:35:09 CST 2018
//        无敌----8-----Tue Nov 20 17:35:11 CST 2018
//        无敌----9-----Tue Nov 20 17:35:13 CST 2018
//        牛掰----5-----Tue Nov 20 17:35:15 CST 2018
//        牛掰----6-----Tue Nov 20 17:35:17 CST 2018
//        牛掰----7-----Tue Nov 20 17:35:19 CST 2018
//        牛掰----8-----Tue Nov 20 17:35:21 CST 2018
//        牛掰----9-----Tue Nov 20 17:35:23 CST 2018
