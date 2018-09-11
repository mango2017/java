package cn.itcast_14;
/**
 * 
 * 形式参数的问题：
 * 基本类型：形式参数的改变不影响实际参数
 * 引用类型：形式参数的改变直接影响实际参数
 * @author Administrator
 *
 */
//形式参数是基本类型
class Demo{
	public int sum(int a,int b) {
		return a+b;
	}
}
class Studentt{
	public void show() {
		System.out.println("我爱学习");
	}
}
class StudentDemo1{
	//如果你看到了一个方法的形式参数是一个类类型（引用类型），这里其实需要的是该类的对象
	public void method(Studentt s) { //调用的时候，把main方法中的s的地址传递到了这里 Studentt s = new Studentt();
		s.show();
	}
}




public class ArgsTest {

	public static void main(String[] args) {
		// 形式参数是基本类型的调用
		Demo demo = new Demo();
		int result = demo.sum(10, 20);
		System.out.println(result);
		
		
		//形式参数是引用类型的调用
		//需求，我要调用StudentDemo1类中的method()方法
		StudentDemo1 sdDemo1 = new StudentDemo1();
		//创建学生对象
		Studentt studentt = new Studentt();
		sdDemo1.method(studentt);//把studentt的地址给到了这里
	}

}
