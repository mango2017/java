package cn.itcast_22;


public class MyThreadJoin extends Thread {
    @Override
    public void run(){
        for(int x=0;x<10;x++){
            System.out.println(getName()+"----"+x);
        }
    }
}