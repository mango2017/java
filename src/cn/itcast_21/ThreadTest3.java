package cn.itcast_21;

public class ThreadTest3 {
     public static void main(String[] args){
        MyThread3 mt1 = new MyThread3("线程1");
        MyThread3 mt2 = new MyThread3("线程2");
        MyThread3 mt3 = new MyThread3("线程3");
//        mt1.run();
//        mt2.run();
//        mt3.run();  //只是顺序执行，不是多线程
         //调用Thread类得start方法才是正确启动多线程的方式
        mt1.start();
        mt2.start();
        mt3.start();
     }
}

class MyThread3 extends  Thread{
    private String title;
    public MyThread3(String title){
        this.title = title;
    }

    @Override
    public void run(){
        for(int i=1;i<4;i++){
            System.out.println(this.title+".x="+i);
        }
    }
}
