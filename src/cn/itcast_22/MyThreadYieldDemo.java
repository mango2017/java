package cn.itcast_22;

public class MyThreadYieldDemo {
     public static void main(String[] args){
//         MyThreadYield my1 = new MyThreadYield();
//         MyThreadYield my2 = new MyThreadYield();
//         my1.setName("无敌");
//         my2.setName("牛掰");
//         my1.start();
//         my2.start();


         //观察串行执行程序和并行执行程序的执行时间
         //就把线程理解为卖票多窗口

         MyThreadYield my1 = new MyThreadYield();
         MyThreadYield1 my2 = new MyThreadYield1();
         my1.setName("无敌");
         my2.setName("牛掰");
         my1.run();
         my2.run();
     }
}
