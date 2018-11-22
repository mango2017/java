package cn.itcast_22;

/**
 * 方式2：实现Runnable接口
 * 步骤:
 * a:自定义类MyRunnable实现Runable接口
 * b:重写run()方法
 * c:创建MyRunnable类对象
 * d:创建Thread类得对象，并把C步骤的对象作为构造参数传递
 */
public class MyRunnableDemo {
     public static void main(String[] args){
         MyRunnable my = new MyRunnable();
         Thread t1 = new Thread(my,"王阿子文");
         Thread t2 = new Thread(my,"喝酒");
         t1.start();
         t2.start();
     }
}
