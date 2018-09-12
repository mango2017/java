package cn.itcast_15;
/**
 * 
 * 构造方法：
 * 给对象的数据进行初始化
 * 格式：
 * a.方法名和类名相同
 * b.没有返回值类型，连void都没有
 * c.没有具体的返回值
 * 构造方法的注意事项：
 * a.如果我们没有给出构造方法，系统将自动提供一个无参构造方法
 * b.如果我们给出了构造方法（不管是有参构造方法还是无参构造方法），系统将不再提供默认的构造方法
 * 注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出，建议永远自己给出无参构造方法
 * @author Administrator
 *
 */
class Xuesheng{
	private String name;
	private int age;
	public Xuesheng() {
		System.out.println("我给了，你还给不");
	}
	//构造方法的重载格式
	public Xuesheng(String name,int age) {
		//System.out.println("这是构造方法");
		this.name = name;
		this.age = age;
	}
}
public class ConstructDemo {

	public static void main(String[] args) {
		//创建对象
		Xuesheng student = new Xuesheng("吴谨言",28);
		System.out.println(student);//地址值：cn.itcast_15.Xuesheng@7852e922

	}

}
