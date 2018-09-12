package cn.itcast_15;
/**
 * private:
 * 是一个权限修饰符
 * 可以修饰成员变量和成员方法
 * 被private修饰的成员只能在本类中才能访问
 * private最常见的应用：
 * 把成员变量用privte修饰
 * 提供对应的getXXX和setXXX方法
 * 
 * 
 * 
 * 
 * @author Administrator
 *
 */
class Demo {
	private int num=10;
	public int show() {
		return num;
	}
	private void method() {
		System.out.println("method");
	}
	public void test() {
		method();
	}
}

public class DemoTest{
	public static void main(String[] args) {
		Demo demo = new Demo();
		int result = demo.show();
		System.out.println(result);
		demo.test();
		
	}	
}
