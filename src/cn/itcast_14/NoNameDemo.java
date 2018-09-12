package cn.itcast_14;
/**
 * 
 * 匿名对象：就是没有名字的对象
 * 匿名对象的应用场景：
 * a.调用方法，仅仅只调用一次的时候
 * b.注意，调用多次的时候，不适合，那么，这种匿名调用有什么好处吗?
 *  有，匿名对象调用完毕就是垃圾，可以被垃圾回收期回收
 *  c.匿名对象可以作为实际参数传递
 * @author Administrator
 *
 */
class Stu{
	public void show() {
		System.out.println("我爱学习");
	}
}
class StuDemo{
	public void method(Stu stu) {
		stu.show();
	}
}
public class NoNameDemo {

	public static void main(String[] args) {
		// 带名字的调用
		Stu stu = new Stu();
		stu.show();  //这里栈内存还指向堆内存呢，没有断开哦
		
		//匿名对象
		new Stu().show();
		new Stu().show();//这里其实是重新创建了一个新的对象
		
		System.out.println("-------------------");
		//匿名对象作为实际参数传递
		StuDemo stuDemo = new StuDemo();
		stuDemo.method(new Stu());
		
		
		System.out.println("-------@@@@@@@@@@--------");
		new StuDemo().method(new Stu());
	}

}
