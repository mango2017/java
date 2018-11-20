package cn.itcast_22;

/**
 * 扫雷程序，迅雷下载
 */

public class MyThread extends  Thread{
    public MyThread(){

    }

    public MyThread(String name){
        super(name);  //调用父类方法
    }


    @Override
    public void run(){
        //自己写代码
        //一般来说，被线程执行的代码肯定是比较耗时的，所以我们用循环改进
        for(int x=0;x<200;x++){
            System.out.println(getName()+"----"+x);
        }
    }

}
