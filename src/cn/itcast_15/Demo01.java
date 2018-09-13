package cn.itcast_15;
/**
 * 
 * 定义一个类demo，其中定义一个求两个数据和的方法
 * 定义一个测试类，进行测试
 * @author Administrator
 *
 */
//方式1满足了我们的需求，但是不好
//因为参与操作的数据现在是固定的
//class Demos{
//	public int sum() {
//		int a=10;
//		int b=20;
//		int c = a+b;
//		return c;
//	}
//}


//方式2可以满足我们的需求，但是呢我们学习过面向对象的思想
//class Demos {
//	public int sum(int a,int b) {
//		return  a+b;
//	}
//}

//方式3
class Demos {
	int a;
	int b;
	public int sum() {
		return  a+b;
	}
}
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demos demo = new Demos();
		//System.out.println(demo.sum());
		//System.out.println(demo.sum(1,2));
		
		demo.a = 10;
		demo.b = 20;
		System.out.println(demo.sum());

	}

}
