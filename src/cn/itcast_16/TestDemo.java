package cn.itcast_16;
class Demo{
	static {
		System.out.println("demo 静态代码块");
	}
	{
		System.out.println("demo 构造代码块");
	}
	public Demo(){
		System.out.println("demo 构造方法");
	}
}
public class TestDemo {
	static {
		System.out.println("吴谨言好美啊....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("我是main方法");
		Demo d1 = new Demo();
		Demo d2 = new Demo();
	}

}
