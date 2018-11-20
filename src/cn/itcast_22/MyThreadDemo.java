package cn.itcast_22;

public class MyThreadDemo {
     public static void main(String[] args){
         //创建线程对象
         //无参构造+setXxx()
//         MyThread my1 = new MyThread();
//         MyThread my2 = new MyThread();
//         MyThread my3 = new MyThread();
//
//         my1.setName("大骡子");
//         my2.setName("马大哈");
//         my3.setName("嘻哈");
//         my1.start();
//         my2.start();
//         my3.start();

//         MyThread my1 = new MyThread("大骡子");
//         MyThread my2 = new MyThread("嘻哈");
//         my1.start();
//         my2.start();
         //我要获取main方法所在的线程对象的名称，该怎么办呢
         //遇到这种情况，thread类提供了一个很好玩的方法
         System.out.println(Thread.currentThread().getName());  //返回当前正在执行的线程对象
      }
}
