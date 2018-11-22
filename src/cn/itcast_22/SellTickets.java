package cn.itcast_22;

public class SellTickets implements Runnable{
    private int tickets = 100;
    @Override
    public void run(){
        while(true){
            if(tickets > 0){
                System.out.println(Thread.currentThread().getName()+"正在出售" + (tickets--)+"张票");
            }
        }

    }
}
