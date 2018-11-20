package cn.itcast_22;

public class MyThreadJoinDemo {
     public static void main(String[] args){
        MyThreadJoin mj1 = new MyThreadJoin();
        MyThreadJoin mj2 = new MyThreadJoin();
        MyThreadJoin mj3 = new MyThreadJoin();
        mj1.setName("宋");
        mj2.setName("金");
        mj3.setName("王");
        mj1.start();
         try {
             mj1.join();   //优先执行线程1   等待该线程终止
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         mj2.start();
         mj3.start();
     }
}
