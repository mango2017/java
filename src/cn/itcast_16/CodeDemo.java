package cn.itcast_16;
/**
 * 
 * 代码块：在java中，使用{}括起来的代码被称为代码块
 * 根据其位置和声明的不同，可以分为
 * 局部代码块：局部位置，用于限定变量的声明周期，及早释放，提高内存利用率
 * 构造代码块：在类中成员位置，用{}括起来的代码，每次调用构造方法执行前，都会先执行构造代码块
 * 作用，可以把多个构造方法中的共同代码放到一起，对对象进行初始化
 * 静态代码块：在类中的成员位置，用{}括起来的代码，只不过它用static修饰了
 * 作用：一般是对类进行初始化
 * 面试题？静态代码块，构造代码块，构造方法的执行顺序
 * 静态代码块----构造代码块----构造方法
 * 静态代码块，只执行一次
 * 构造代码块，每次调用构造方法都执行
 * @author Administrator
 *
 */
class Code{
	//静态代码块
	static {
		int a = 100;
		System.out.println(a);
	}
	
	//构造代码块
	{
		int x =200;
		System.out.println(x);
	}
	
	{
		int y=300;
		System.out.println(y);
	}
	
	static {
		int b = 400;
		System.out.println(b);
	}
	public Code() {
		System.out.println("无参构造方法");
	}
	public Code(int a) {
		System.out.println("有参构造方法");
	}
}
public class CodeDemo {
	static {
		System.out.println("hj");
	}
	public static void main(String[] args) {
//		{
//			int x = 90;
//			System.out.println(x);
//		}
////		System.out.println(x);
//		Code code1 = new Code();
//		System.out.println("--------------");
//		Code code2 = new Code(10);
//		System.out.println(1);
	}
}
