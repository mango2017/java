package cn.itcast_22;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();
        tp1.setName("东方不败");
        tp2.setName("岳不群");
        tp3.setName("林平之");
//        tp1.start();
//        tp2.start();
//        tp3.start();
//         System.out.println(tp1.getPriority());//获取优先级
//         System.out.println(tp1.getPriority());
//         System.out.println(tp1.getPriority());
        tp1.setPriority(10);
        tp1.setPriority(1);
        tp1.setPriority(5);
        tp1.start();
        tp2.start();
        tp3.start();

    }
}
